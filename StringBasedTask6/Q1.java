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
        StringBuilder s1 = new StringBuilder("Ram");
        System.out.println(s.append(s1));
        System.out.println(s.insert(3,s1));
    }
}