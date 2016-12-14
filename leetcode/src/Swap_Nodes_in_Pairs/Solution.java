package Swap_Nodes_in_Pairs;

public class Solution {
	public static ListNode swapPairs(ListNode head){
		if(head == null){return head;}
		if(head.next == null){return head;}
		ListNode one, two, swap;
		ListNode NodeNum = head;
		ListNode start = head;
		int num = 1;
		while(NodeNum.next != null){
			num++;
			NodeNum = NodeNum.next;
		}
		
		if(num%2 == 0){
			start = head.next;
			while(head != null){
				swap = head.next;
				head.next.next = head;
				head.next = swap.next;
				head = swap.next.next;
			}
		}else{
			start = head.next;
			while(head.next != null){
				swap = head.next;
				head.next.next = head;
				head.next = swap.next;
				head = swap.next.next;
			}
			
		}
		
		return start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
