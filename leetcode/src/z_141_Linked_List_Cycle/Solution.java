package z_141_Linked_List_Cycle;

import Merge_Two_Sorted_Lists.ListNode;

public class Solution {
	public boolean hasCycle(ListNode head) {
		if(head.equals(null) || head.next == null) return false;
		ListNode one = head;
		ListNode two = head;
		while(one != null && two != null){
			if(one == two) return true;
			else{
				one = one.next;
				two = two.next.next;
			}
		}
		
        
        return false;
    }
}
