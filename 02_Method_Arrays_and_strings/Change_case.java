class Solution {
    public static void changeCase(String s) {
        // code here
        
        String result = s.substring(0,1).toUpperCase() + s.substring(1); 
        System.out.println(result);
        System.out.println(s.toUpperCase());
    }
}