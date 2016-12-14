package z_61_rotate_list;

import Merge_Two_Sorted_Lists.ListNode;

public class Solution {
	public ListNode rotateRight(ListNode head, int k) {
		if(k == 0 || head == null) return head;
		ListNode start = head;
		ListNode fast = head, slow = head;
		for(int i = 0; i < k; i++){
			fast = fast.next;
		}
		while(fast.next != null){
			fast = fast.next;
			slow = slow.next;
		}
		ListNode newhead = slow.next;
		slow.next = null;
		fast.next = start;
		
		return newhead;
        
    }

}
