/*
 Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357
 */
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int i = 1,j;
    while(i<=N){
        int odd = 2*i-1;
        j=N;
        while(j>=i){
            System.out.print(odd);
            odd = odd +2;
            j--;
        }
        j = 1;
        int  p =1;
        while(j<=i-1){
            
            System.out.print(p);
            p= p+2;
            j++;
        }
        System.out.println();
        i++;
    }
    }
}

