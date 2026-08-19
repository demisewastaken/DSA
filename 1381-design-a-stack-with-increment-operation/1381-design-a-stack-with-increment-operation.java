class CustomStack {
    private final int size;
    private int TopOfStack;
    private final int[] stack;

    public CustomStack(int maxSize) {
        this.size = maxSize;
        this.TopOfStack = -1;
        this.stack = new int[maxSize];
    }
    
    public void push(int x) {
        if (this.TopOfStack != this.size - 1) {
            TopOfStack++;
            this.stack[TopOfStack] = x;
        }
    }
    
    public int pop() {
        if (this.TopOfStack == -1) {
            return -1; //Stack is empty
        }else {
            int temp = this.stack[TopOfStack];
            TopOfStack--;
            return temp;
        }
    }
    
    public void increment(int k, int val) {
            int count = 0;
            while (count <= this.TopOfStack && count < k) {
                this.stack[count] += val;
                count++;
            }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */