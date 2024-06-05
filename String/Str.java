// == operator and equals() method in java programming

class Str{
    public static void main(String[] args) {
        String a = new String("HELLO");
        String b = new String("HELLO");
        String c = b;
        System.out.println(a==b);  // false
        System.out.println(a.equals(b));  // true
        System.out.println(c==b);   // true

        // Only One Object Will be create
        String d = "HI";
        String e = "HI";
        String f = e;
        System.out.println(d==e);
        System.out.println(d.equals(e));
        System.out.println(f==e);

        // equal ignore case
        System.out.println("Ignore Case");
        String x = "HELLO";
        String y = "hello";
        System.out.println(x.equals(y));
        System.out.println(x.equalsIgnoreCase(y));

        // Wrapper class
        Integer i = new Integer(10);
        Integer j = new Integer(10);
        System.out.println(i==j);
        System.out.println(i.equals(j));
	System.out.println(i.compareTo(j));

        // isEmpty()
        // it will return true given String is empty otherwise return false
        String s = "54465";
        System.out.println(s.isEmpty());
    }
}
