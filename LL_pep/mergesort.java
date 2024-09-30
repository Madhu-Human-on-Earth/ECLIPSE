package LL_pep;

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        next = null;
    }
}

class mergesort {
    public ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode mid = findMid(head);
        
        ListNode head2 = mid.next;
        mid.next = null;
        
        ListNode newHead1 = mergeSort(head);
        
        ListNode newHead2 = mergeSort(head2);
        
        ListNode finalHead = merge(newHead1, newHead2);

        return finalHead;
    }

    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode merged = new ListNode(-1);
        ListNode temp = merged;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return merged.next;
    }

    public ListNode findMid(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(7);
        ListNode temp = head;
        temp.next = new ListNode(10);
        temp = temp.next;
        temp.next = new ListNode(5);
        temp = temp.next;
        temp.next = new ListNode(20);
        temp = temp.next;
        temp.next = new ListNode(3);
        temp = temp.next;
        temp.next = new ListNode(2);
        temp = temp.next;

        mergesort solution = new mergesort();
        head = solution.mergeSort(head);
        System.out.print("\nSorted Linked List is: \n");
        solution.printList(head);
    }
}
