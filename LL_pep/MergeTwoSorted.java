package LL_pep;

import java.util.Scanner;

import LL_pep.basic01.Node;

public class MergeTwoSorted {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public LinkedList() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public void addLast(int data) {
        	 Node newNode = new Node(data);

             if (head == null) {
                 head = newNode;
             } else {
                 Node temp = head;
                 while (temp.next != null) {
                     temp = temp.next;
                 }
                 temp.next = newNode;
             }

             
    }

    public static LinkedList mergeTwoLists(LinkedList l1, LinkedList l2) {
        Node one = l1.head;
        Node two = l2.head;

        LinkedList res = new LinkedList();

        while (one != null && two != null) {
            if (one.data < two.data) {
                res.addLast(one.data);
                one = one.next;
            } else {
                res.addLast(two.data);
                two = two.next;
            }
        }

        while (one != null) {
            res.addLast(one.data);
            one = one.next;
        }
        while (two != null) {
            res.addLast(two.data);
            two = two.next;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of elements for List_1:");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        LinkedList l1 = new LinkedList();
        for (int i = 0; i < n1; i++) {
            int d = sc.nextInt();
            l1.addLast(d);
        }

        System.out.println("Enter the number of elements for List_2:");
        int n2 = sc.nextInt();
        LinkedList l2 = new LinkedList();
        for (int i = 0; i < n2; i++) {
            int d = sc.nextInt();
            l2.addLast(d);
        }
//
     LinkedList mergedList = mergeTwoLists(l1, l2);

        System.out.println("Merged List:");
        Node current = mergedList.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    }
}
