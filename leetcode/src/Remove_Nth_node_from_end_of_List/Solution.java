package Remove_Nth_node_from_end_of_List;

public class Solution {
	
	public static ListNode RemoveNthFromEnd(ListNode head, int n){
		
		ListNode fast = new ListNode(0);
		ListNode slow = new ListNode(10);
		ListNode start = new ListNode(100);
		fast.next = head;
		slow.next = head;
		start.next = head;
		
		for(int i = 1; i <= n; i++){
			fast = fast.next;
		}
		
		while(fast.next != null){
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;	
		return start.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		a.next = b;
		a.next = null;
		while(a != null){
			System.out.println(a.val);
			a = a.next;
		}
		System.out.println(b.val);
	}

}
