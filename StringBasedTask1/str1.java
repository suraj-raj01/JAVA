class str1 {
    public static void main(String[] args) {
        String s = new String("Betty got a bit of bitter better butter");
        String arr[] = s.split(" ");
        System.out.println(s);

        System.out.println("\nprint String and its Length:");
        for (int i = 0; i < arr.length; i++) {
            int len = arr[i].length();
            System.out.println(arr[i] + " : " + len);
        }

        System.out.println("\nPrint index of b and t");
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'b') {
                System.out.println("index of b : " + i);
            } else if (c[i] == 't') {
                System.out.println("index of t : " + i);
            }
        }

        System.out.println("\nPrint all word that start with b");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) == 'b') {
                System.out.println(arr[i]);
            }
        }
    }
}
