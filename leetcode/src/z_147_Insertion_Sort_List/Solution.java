package z_147_Insertion_Sort_List;

public class Solution {
	public ListNode insertionSortList(ListNode head) {
		if(head == null || head.next == null) return head;
		
		ListNode init = new ListNode(0);
		ListNode pre = init;
		init.next = head;
		ListNode cur = head;
		ListNode next = cur.next;
		
		while(cur != null){
			next = cur.next;
			
			while(pre.next != null && pre.next.val < cur.val){
				pre = pre.next;
			}
			
			cur.next = pre.next;
			pre.next = cur;
			pre = init;
			
			cur = next;
		}
		
		
		
		return head;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
