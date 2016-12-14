package Merge_Two_Sorted_Lists;

public class Solution {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null){return l2;}
		if(l2 == null){return l1;}
		ListNode result = new ListNode(1);
		ListNode marker = result;
		
		if(l1.val <= l2.val){
			result = l1;
			l1 = l1.next;
			result.next = mergeTwoLists(l1,l2);
		}else{
			result = l2;
			l2 = l2.next;
			result.next = mergeTwoLists(l1,l2);
		}
		return result;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(0);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(1);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(2);
		ListNode f = new ListNode(5);
		a.next = c;c.next = e;
		b.next = d;d.next = f;
		ListNode result = mergeTwoLists(a,b);
		while(result != null){
			System.out.println(result.val);
			result = result.next;
		}
	}

}
