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
