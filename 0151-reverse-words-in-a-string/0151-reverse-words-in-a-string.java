class Solution {
    public String reverseWords(String s) {
        s.trim();
        int n = s.length();
        StringBuilder temp = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        boolean check = false;
        for(int i=n-1;i>=0;i--){
            while(i>=0 && s.charAt(i) != ' '){
                temp.append(s.charAt(i));
                i--;
                check =  true;
            }
            if(check){
                ans.append(temp.reverse());
                ans.append(" ");
                temp.setLength(0);
            }
            check = false;
        }
        return ans.toString().trim();
    }
}