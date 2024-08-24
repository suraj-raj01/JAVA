public class Pow {
    public static int power(int base, int exp){
        if(base==0){
            return 0;
        }
        if(exp==0){
            return 1;
        }
        return base*power(base, exp-1);
    }
    public static void main(String[] args) {
        int base = 5;
        int exp = 3;
        int res = power(base, exp);
        System.out.println(res);
    }
}
