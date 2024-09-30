package LL_pep;

import java.util.Scanner;

public class Odd_Even {

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
    }

    public static void main(String[] args) {
        Node head = takeInput();

        System.out.println("Original Linked List:");
        print(head);

        head = segregateEvenOdd(head);

        System.out.println("Modified Linked List:");
        print(head);
    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
 
        public static Node segregateEvenOdd(Node head) {
            if (head == null) {
                return head;
            }
            
            Node odd = head;
            Node even = head.next;

            Node evenHead = even;

            while (even != null && even.next != null) {
                odd.next = even.next;
                odd = odd.next;

                even.next = odd.next;
                even = even.next;
            }

            odd.next = reverse(evenHead);
            return head;
        }

        private static Node reverse(Node head) {
            Node prev = null;
            Node current = head;

            while (current != null) {
                Node nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }

            return prev;
        }
    
//    private static Node segregateEvenOdd(Node head) {
//        Node oddStart = null;
//        Node oddEnd = null;
//        Node evenStart = null;
//        Node evenEnd = null;
//
//        Node curr = head;
//
//        while (curr != null) {
//            int currVal = curr.data;
//
//            if (currVal % 2 == 0) {
//                if (evenStart == null) {
//                    evenStart = new Node(currVal);
//                    evenEnd = evenStart;
//                } else {
//                    evenEnd.next = curr;
//                    evenEnd = evenEnd.next;
//                }
//            } else {
//                if (oddStart == null) {
//                    oddStart = new Node(currVal);
//                    oddEnd = oddStart;
//                } else {
//                    oddEnd.next = curr;
//                    oddEnd = oddEnd.next;
//                }
//            }
//
//            curr = curr.next;
//        }
//
//        if (oddStart != null && evenStart != null) {
//            evenEnd.next = oddStart;
//            oddEnd.next = null;
//            head = evenStart;
//        }
//
//        return head;
//    }

    private static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    private static Node takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node head = null;
        Node tail = null;

        while (data != -1) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

            data = sc.nextInt();
        }

        return head;
    }
}
