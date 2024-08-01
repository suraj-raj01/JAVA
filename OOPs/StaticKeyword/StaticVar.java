/*
Static Variable in Java Programming:
When a variable declared static, then a single copy of the variable is crated
and share among all objects of at the class level.
Static variable recommended to access via className or directly without using
object of class.
*/

class StaticVar{
    String name = "SURAJ KUMAR";
    static String collegeName = "RNTU, BHOPAL";
    public static void main(String[] args) {
        // System.out.println(collegeName);
        StaticVar obj = new StaticVar();
        System.out.println("Student name: "+obj.name);
        // System.out.println("College Name: "+obj.collegeName);
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