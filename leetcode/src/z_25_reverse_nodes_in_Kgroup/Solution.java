package z_25_reverse_nodes_in_Kgroup;

import Merge_Two_Sorted_Lists.ListNode;

public class Solution {
	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode curr = head;
		int count = 0;
		while(curr != null && count != k){
			curr = curr.next;
			count++;
		}
		if(count == k){
			if(count == k) curr = reverseKGroup(curr, k);
			
			while(count-- > 0){
				ListNode temp = head.next;
				head.next = curr;
				curr = head;
				head = temp;
			}
			head = curr;
			
		}
		return head;
        
    }

}
