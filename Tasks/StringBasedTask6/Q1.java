/*
Input:
Input custom StringBuilder = Hello
Output:
--> StringBuilder to be added 'Ram'
--> If end position, Output: HelloRam
--> If in beginning, Output: RamHello
--> If at sat 3rd index, Output: HelRamlo
*/

class Q1{
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello");
        String s1 = new String("Ram");
        System.out.println(s.append(s1));
        s.delete(5,8);
        System.out.println(s.insert(0,s1));
        s.delete(0,3);
        System.out.println(s.insert(s.length()-2, s1));
    }
}