//Given a number n, return first digit of a number
class Solution {
    public static int firstDigit(int n) {
        // code here
        while( n >= 10){
            n=n/10;
        }
        return n;
    }
    
    
    public static void main(String[] args){
        firstDigit(32324);
    }
}