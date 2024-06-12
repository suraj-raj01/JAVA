// Java doesn't support negative Index.

public class arr2 {
    public static void main(String[] args) {

	System.out.println("Integer Type Value : ");
        int[] i = new int[5];
	i[0] = 2;
	i[1] = 2;
	i[2] = 6;
	i[3] = 4;
	i[4] = 6;
	// print data
	System.out.println(i[0]);
	System.out.println(i[1]);
	System.out.println(i[2]);
	System.out.println(i[3]);
	System.out.println(i[4]);

	System.out.println("\nFloat Type Value : ");
        float[] f = new float[5];
	f[0] = 2.54f;
	f[1] = 2.14f;
	f[2] = 6.54f;
	f[3] = 4.24f;
	f[4] = 6.44f;
	// print data
	System.out.println(f[0]);
	System.out.println(f[1]);
	System.out.println(f[2]);
	System.out.println(f[3]);
	System.out.println(f[4]);

	System.out.println("\nDouble Type Value : ");
        double[] d = new double[5];
	d[0] = 2.54;
	d[1] = 2.14;
	d[2] = 6.54;
	d[3] = 4.24;
	d[4] = 6.44;
	// print data
	System.out.println(d[0]);
	System.out.println(d[1]);
	System.out.println(d[2]);
	System.out.println(d[3]);
	System.out.println(d[4]);
    }
}
