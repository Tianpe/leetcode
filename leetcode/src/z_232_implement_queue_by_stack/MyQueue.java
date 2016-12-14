package z_232_implement_queue_by_stack;

import java.util.Stack;

class MyQueue {
	
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> backup = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        for(int i = 0; i < stack.size(); i ++){
        	backup.push(stack.pop());
        }
        backup.add(x);
        for(int i = 0; i < backup.size(); i ++){
        	stack.add(backup.pop());
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        stack.pop();
    }

    // Get the front element.
    public int peek() {
        return stack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}
