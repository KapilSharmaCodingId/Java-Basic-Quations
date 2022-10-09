/*
Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.

Sample Input 1:
0 
100 
20
Sample Output 1:
0   -17
20  -6
40  4
60  15
80  26
100 37
Sample Input 2:
20
119
13
Sample Output 2:
20  -6
33  0 
46  7
59  15
72  22
85  29
98  36
111 43
*/


public static void main(String[] args) {
		
  Scanner s=new Scanner(System.in);
    int start=s.nextInt();
    int end=s.nextInt();
    int step=s.nextInt();
    while(start<=end){
        int first = start;
       first =((5*(first-32))/9);
        System.out.println(start +" "+first);
        start=start+step;
    }

}
