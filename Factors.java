import java.util.Scanner;
public class Factors {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i = 2;
        boolean flag = true;
        while(i<n){
            if(n%i==0){
                System.out.print(i+" ");
                flag = false;
            }
            i++;
        }
        if(flag){
            System.out.print("No Factors");
        }
    }
}