class ProductOfNumbers {
    List<Integer> list;
    int size;
    public ProductOfNumbers() {
        list = new ArrayList<>();
        size = 0;
    }
    
    public void add(int num) {
        list.add(num);
        size += 1;
    }
    
    public int getProduct(int k) {
        int ans = 1;
        for (int i = size-k; i < size; i++) {
            ans *= list.get(i);
        }
        return ans;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */