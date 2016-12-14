package z_148_Sort_List;


public class Solution {
	public ListNode sortList(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode h1 = head;
		ListNode onestep = head;
		ListNode twostep = head.next;
		while(twostep != null && twostep != null){
			onestep = onestep.next;
			twostep = twostep.next.next;
		}
		ListNode h2 = onestep.next;
		onestep.next = null;
		ListNode result = merge(sortList(h1),sortList(h2));
		return result;
	}
	
	public ListNode merge(ListNode h1, ListNode h2){
		ListNode init =new ListNode(Integer.MIN_VALUE);
		ListNode pointer = init;
		while(h1 != null && h2 != null){
			if(h1.val < h2.val){
				pointer.next = h1;
				h1 = h1.next;
				pointer = pointer.next;
			}
			else{
				pointer.next = h2;
				h2 = h2.next;
				pointer = pointer.next;
			}		
		}
		if(h1 == null){
			pointer.next = h2;
		}
		if(h2 == null){
			pointer.next = h1;
		}	
		return init.next;
	}
		
		
		
		
		
		
        
    


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
