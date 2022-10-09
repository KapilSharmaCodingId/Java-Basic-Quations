
/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
55555 
4444
333
22
1
Sample Input 2:
6
Sample Output 2:
666666
55555 
4444
333
22
1
*/
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
