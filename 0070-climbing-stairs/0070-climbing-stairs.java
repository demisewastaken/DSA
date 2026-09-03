class Solution {
    public int climbStairs(int n) {
        //fibo series 
        //apply the fibo formula to use constant time complexity
        return (int)((Math.pow((1 + Math.sqrt(5))/2, n + 1) -  Math.pow((1 - Math.sqrt(5))/2, n + 1)) /Math.sqrt(5));
    }
}