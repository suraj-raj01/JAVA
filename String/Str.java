public class Str {
    public static void main(String[] args) {
        String s = new String("SURAJ");
	//s = "SURAJ";
        System.out.println(s);

	char arr[] = {'A','B','C','D'};
	String c = new String(arr);
	System.out.println(c);
	
	byte d[] = {65,66,67,68,69};
	String b = new String(d,0,4);
	System.out.println(b);
	
	String n = new String("WELCOME");
	char x = n.charAt(5);
	System.out.println(x);
    }
}
