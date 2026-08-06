class Solution {
    public static boolean checkPangram(String s) {
        // code here
        s = s.toLowerCase();
        for (char i='a'; i<='z'; i++){
            if (s.indexOf(i)== -1)
            return false;
        } return true;
    }
}