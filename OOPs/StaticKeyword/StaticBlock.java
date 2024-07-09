/*
Static Block in Java Programming.

static
{
// statements
}
*/
public class StaticBlock {
    String name = "ABCD";
    static String CollegeName;
    static int count=0;
    public int getData(int count)
    {
        return count;
    }
    public StaticBlock()
    {
        count++;
    }
    public StaticBlock(String name)
    {
        this.name = name;
        count++;
    }
    static{
        System.out.println("This is Static Block-1");
    }
    static{
        System.out.println("This is Static Block-2");
    }
    public static void main(String[] args) {
        System.out.println("This is Main Method!!");
        CollegeName = "RNTU BHOPAL";
        System.out.println("College Name: "+CollegeName);
        StaticBlock obj = new StaticBlock();
        StaticBlock obj1 = new StaticBlock("SURAJ");
        System.out.println(obj.getData(1));
        System.out.println("Number of Object created: "+count);
        System.out.println("Number of Object created: "+count);
        System.out.println("Number of Object created: "+count);
    }
}
/*
This is Static Block-1
This is Static Block-2
This is Main Method!!
College Name: RNTU BHOPAL
1
Number of Object created: 2
Number of Object created: 2
Number of Object created: 2
*/
