// A function call itself call Recursion
// Example without recursion

public class rec {
	public static int one(){
	return two();
	}
	public static int two(){
	return three();
	}
	public static int three(){
	return four();
	}
	public static int four(){
	return 25;
	}
   public static void main(String[] args) {
    System.out.println(one());
   } 
}
