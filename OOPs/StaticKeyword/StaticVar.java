/*
Static Variable in Java Programming
*/

class StaticVar{
    String name = "SURAJ KUMAR";
    static String collegeName = "RNTU, BHOPAL";
    public static void main(String[] args) {
        // System.out.println(collegeName);
        StaticVar obj = new StaticVar();
        System.out.println("Student name: "+obj.name);
        System.out.println("College Name: "+obj.collegeName);
        // static variable recommended to access via className.
        // Or we can directly access collegeName.
        System.out.println("College Name: "+StaticVar.collegeName);
        System.out.println("College Name: "+collegeName);
    }
}

/*
Student name: SURAJ KUMAR
College Name: RNTU, BHOPAL
College Name: RNTU, BHOPAL
College Name: RNTU, BHOPAL
*/