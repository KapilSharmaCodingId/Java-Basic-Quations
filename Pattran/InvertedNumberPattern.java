import java.util.*;
public class InvertedNumberPattern {


	public static void main(String[] args) {
		
	
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i=1;
        while(i<=N){
            int j=1;
            int S = N-i+1;
            while(j<=S){
                System.out.print(S);
                j++;
            }
            System.out.println();
            i++;
        }
        
		
	}

}
