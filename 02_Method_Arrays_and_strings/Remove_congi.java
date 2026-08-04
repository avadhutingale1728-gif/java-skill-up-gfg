import java.util.Scanner;

public class Remove_congi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        
//        char current;
        for(int i=0; i<=str.length()-1; i++){
            char current = str.charAt(i);
            
           if(result.length()>0 && result.charAt(result.length()-1) == current){
               result.deleteCharAt(result.length()-1);
           } else{
               result.append(current);
           }
        } System.out.println(result);
    }
}