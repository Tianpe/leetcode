package z_82_remove_duplicated_node_from_sorted_list;

import java.util.HashMap;

import Merge_Two_Sorted_Lists.ListNode;

public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode dummy = new ListNode(Integer.MIN_VALUE);
		dummy.next = head;
		ListNode travel = head;
		ListNode pre = dummy;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		while(travel != null){
			if(map.containsKey(travel.val)) map.put(travel.val, map.get(travel.val)+1);
			else{
				map.put(travel.val, 0);
			}
		}
		travel = head;
		
		while(travel != null){
			if(map.get(travel.val) == 0) {
				pre.next = travel;
				pre = travel;
				travel = travel.next;
			}else{
				travel = travel.next;
			}
		}
		
		
		
		
		
		
        return dummy.next;
        
        
    }

}
