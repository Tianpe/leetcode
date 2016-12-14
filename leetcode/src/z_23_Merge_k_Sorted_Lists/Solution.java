package z_23_Merge_k_Sorted_Lists;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
	public static ListNode mergeKLists(ListNode[] lists) {
		if(lists == null) return null;
		PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>(){

			@Override
			public int compare(ListNode one, ListNode two) {
				// TODO Auto-generated method stub
				if(one.val > two.val) return 1;
				else if(one.val == two.val) return 0;
				else return -1;
			}
			
		});
		
		for(int i = 0; i < lists.length; i++){
			queue.add(lists[i]);
		}
		
		ListNode result = new ListNode(0);
		ListNode point = result;
		
		while(!queue.isEmpty()){
			ListNode newOne = queue.poll();
			if(newOne.next != null) queue.add(newOne.next);
			point.next = newOne;
			point = point.next;
		}	
        return result.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		a.next = new ListNode(3);
		a.next.next = new ListNode(5);
		
		ListNode b = new ListNode(2);
		b.next = new ListNode(4);
		b.next.next = new ListNode(6); 
		
		ListNode c = new ListNode(0);
		c.next = new ListNode(7);
		c.next.next = new ListNode(8); 
		
		ListNode[] res = {a,b,c};
		ListNode test = mergeKLists(res);
		while(test != null){
			System.out.println(test.val);
			test = test.next;
		}

	}

}
