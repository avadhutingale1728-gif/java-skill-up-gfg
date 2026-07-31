class Solution {
    public void printPattern(int n) {
        
        for(int i=1; i<= n; i++){  // outer loop
        
            for(int j=1; j<=i; j++){   //inner loop
            
                if(j==1 || j==i || i==n ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            } System.out.println();
        }
    }
}