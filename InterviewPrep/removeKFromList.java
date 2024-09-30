package InterviewPrep;

import java.util.List;

class ListNode<T> {
    ListNode(T x) {
        value = x;
    }
    T value;
    ListNode<T> next;
}

public class removeKFromList {
	public static void main(String[] args) {
		int[] elements = {1, 2, 8, 7, 5, 9, 3};
		ListNode<Integer> head = new ListNode<>(elements[0]);
		ListNode<Integer> current = head;
		for (int i = 1; i < elements.length; i++) {
		    current.next = new ListNode<>(elements[i]);
		    current = current.next;
		}


		int k = 3;
		ListNode<Integer> result = solution(head, k);

		while (result != null) {
		System.out.print(result.value + " ");
		result = result.next;
		}
		System.out.println();
		}
	
	static ListNode<Integer> solution(ListNode<Integer> l, int k) {
		  ListNode dummy = new ListNode(0);
		  dummy.next =l;

		  ListNode<Integer> curr = dummy;
		  while (curr.next != null) {
		    if (curr.next.value == k) {
		      curr.next = curr.next.next;
		    } else {
		      curr = curr.next;
		    }
		  }
		  return dummy.next;
		}
}