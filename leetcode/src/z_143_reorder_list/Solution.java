package z_143_reorder_list;

import Merge_Two_Sorted_Lists.ListNode;

public class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return;
        int count = 0;
        ListNode pointer = head;
        
        while(pointer != null){
        	count ++;
        	pointer = pointer.next;
        }
        helper(head, count);
        
    }
    
    public void helper(ListNode head, int count){
    	if(count <= 2) return;
    	if(head.next == null || head.next.next == null ) return;
    	ListNode pointer = head;
    	while(pointer.next.next != null){
    		pointer = pointer.next;
    	}
    	ListNode temp = head.next;
    	head.next = pointer.next;
    	pointer.next.next = temp;
    	pointer.next = null;
    	helper(head.next.next, (count - 2));
    }
}