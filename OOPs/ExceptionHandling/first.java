
class first{
    public static void main(String[] args) {
        int a,b,c;
        a = 5;
        b = 0;
        c = 0;
        try{
            c = a/b;
            System.out.println("This is try Block");
        }catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be zero");
        }
        System.out.println("After Exception:");
        System.out.println("Value of c : "+c);
    }
}