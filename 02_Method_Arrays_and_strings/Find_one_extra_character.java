class Solution{
    public char extraChar(String s1, String s2){
        char ans = 0;
        
        for (char ch : s1.toCharArray())
            ans ^= ch;
            
        for (char ch : s2.toCharArray())
            ans ^= ch;
            
            return ans;
    }
}
