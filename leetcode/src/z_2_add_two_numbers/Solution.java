package z_2_add_two_numbers;

import Merge_Two_Sorted_Lists.ListNode;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode r1 = l1;
		ListNode r2 = l2;
		ListNode head = new ListNode(0);
		ListNode point = head;
		int sum = 0;
		
		while(r1 != null || r2 != null){
			sum = sum/10;
			if(r1 != null){
				sum = sum + r1.val;
				r1 = r1.next;
			}
			if(r2 != null){
				sum = sum + r2.val;
				r2 = r2.next;
			}
			int dig = sum%10;
			ListNode newDig = new ListNode(dig);
			point.next = newDig;
			point = point.next;
		}
		int last = sum/10;
		if(last != 0){
			point.next = new ListNode(last);
		}
	
		return head.next;
	}
}
