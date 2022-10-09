import java.util.*;
public class Solution {
	public static void main(String[] args) {
    
      	 Scanner input = new Scanner(System.in);
        int n = input.nextInt();
       
        
        int i,j;
        for(i=n;i>=1;i--){
            
         for(j=i;j<=n;j++)
         { 
             System.out.print((char)(j+64));
         } 
         System.out.println("");
     }
    }
}