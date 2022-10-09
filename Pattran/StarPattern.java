import java.util.*;
public class StarPattern {


	public static void main(String[] args) {
		
	
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        while(i<=N){
            int j =1;
            while(j<=N-i){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            j=1;
            while(j<=i-1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
            
        }
	}

}
