package z_206_Reverse_LinkedList;

public class Solution {
	public ListNode reverseList(ListNode head) {
		ListNode init = new ListNode(0);
		if(head == null && head.next == null) return head;
		ListNode cur = head;
		
		while(cur != null){
			ListNode temp = init.next;
			init.next = cur;
			cur.next = temp;
			cur = cur.next;
		}
		
        
		
		return init.next;
    }

}
