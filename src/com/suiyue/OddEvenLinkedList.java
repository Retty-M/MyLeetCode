package com.suiyue;

public class OddEvenLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode oddEvenList(ListNode head) {
		if(head != null) {
			ListNode odd = head;
			ListNode evenHead = head.next;
			ListNode even = head.next;
			while(even!=null && even.next!=null) {
				odd.next = even.next;
				even.next = even.next.next;
				odd = odd.next;
				even = even.next;
			}
			odd.next = evenHead;
		}	
		return head;
    }
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}

}
