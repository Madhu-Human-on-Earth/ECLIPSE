package Generics_Tree_Ppc;

import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static ArrayList<Node> nodeToRootPath(Node node, int data) {
    if (node == null) {
      return new ArrayList<>();
    }

    if (node.data == data) {
      ArrayList<Node> list = new ArrayList<>();
      list.add(node);
      return list;
    }

    ArrayList<Node> llist = nodeToRootPath(node.left, data);
    if (llist.size() > 0) {
      llist.add(node);
      return llist;
    }

    ArrayList<Node> rlist = nodeToRootPath(node.right, data);
    if (rlist.size() > 0) {
      rlist.add(node);
      return rlist;
    }

    return new ArrayList<>();
  }

  public static void printKNodesFar(Node node, int data, int k) {
    ArrayList<Node> path = nodeToRootPath(node, data);
    printKLevelsDown(path.get(0), k);
    for (int i = 1; i < path.size(); i++) {
      Node prev = path.get(i - 1);
      Node curr = path.get(i);

      if (i < k) {
        if (prev == curr.left) {
          printKLevelsDown(curr.right, k - i - 1);
        } else {
          printKLevelsDown(curr.left, k - i - 1);
        }
      } else if (i == k) {
        System.out.println(curr.data);
      } else {
        break;
      }
    }
  }

  public static void printKLevelsDown(Node node, int k) {
    if (node == null || k < 0) {
      return;
    }

    if (k == 0) {
      System.out.println(node.data);
      return;
    }

    printKLevelsDown(node.left, k - 1);
    printKLevelsDown(node.right, k - 1);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    int data = Integer.parseInt(br.readLine());
    int k = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    printKNodesFar(root, data, k);
  }

}
                                