// WAP to print number 1 to 60 which is divisible by 3 and 5.

class Division1{
	public static void main(String args[]){
		int n;
		n=1;
		while(n<=60){
			if(n%3==0 && n%5==0){
			System.out.println(n);
			}
			n++;
		}
	}
}