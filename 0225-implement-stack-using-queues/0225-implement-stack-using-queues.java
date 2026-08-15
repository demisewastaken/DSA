import java.util.Queue;
import java.util.LinkedList;

class MyStack {

    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();

    public MyStack() {
    }
    
    public void push(int x) {
        queue1.offer(x);
    }
    
    public int pop() {
        if (queue1.isEmpty()) {
            return -1;
        } 

        while (queue1.size() != 1) {
            queue2.offer(queue1.poll());
        }
        int ans = queue1.poll();

        while (!queue2.isEmpty()) {
            queue1.offer(queue2.poll());
        }

        return ans;
    }
    
    public int top() {
        if (queue1.isEmpty()) {
            return -1;
        }

        while (queue1.size() != 1) {
            queue2.offer(queue1.poll());
        }
        int ans = queue1.poll();
        queue2.offer(ans);
        while (!queue2.isEmpty()) {
            queue1.offer(queue2.poll());
        }

        return ans;
        
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */