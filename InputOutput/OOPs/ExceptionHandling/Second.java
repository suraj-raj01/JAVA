// Multiple Catch Blocks.

public class Second {
    public static void main(String[] args) {
        int num=0;
        try{
            num = Integer.parseInt(args[0]);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Please enter atleast one character");
        }catch(NumberFormatException e)
        {
            System.out.println("Please enter numeric value only");
        }
        System.out.println("Result : "+(int)(Math.pow(num, 2)));
    }
}
