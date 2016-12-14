package z_138_Copy_list_with_random_pointer;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
    	RandomListNode pointer = head;
    	if(head == null || head.next == null) return pointer;
    	Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
    	
    	while(pointer != null){
    		map.put(pointer, new RandomListNode(pointer.label) );
    		pointer = pointer.next;
    	}
    	
    	pointer = head;
    	while(pointer != null){
    		map.get(pointer).next = map.get(pointer.next);
    		map.get(pointer).random = map.get(pointer.random);
    		pointer = pointer.next;
    	}
    	
    	
    	return map.get(head);
        
        
    }
}
