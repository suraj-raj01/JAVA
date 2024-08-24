public class ReverseString {
    public static void reverseString(String string, int size){
        if(size==0){
            System.out.print(string.charAt(size));
            return;
        }
        System.out.print(string.charAt(size));
        reverseString(string, size-1);
    }
    public static void main(String[] args) {
        String string = "JARUS";
        reverseString(string, string.length()-1);
    }
}
