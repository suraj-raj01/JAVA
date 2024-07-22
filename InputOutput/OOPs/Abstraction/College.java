/*
Abstraction in java
*/
abstract class RGPV{
    public abstract void lab();
    public abstract void cctv();

    public void copyExamCheck()
    {
        System.out.println("This is RGPV non abstract Method");
    }
    public RGPV()
    {
        System.out.println("This is RGPV Constructor");
    }
}

class College extends RGPV{
    public void cctv()
    {
        System.out.println("This is cctv method rule by RGPV");
    }
    public void lab()
    {
        System.out.println("This is lab method rule by RGPV");
    }
    public void staff()
    {
        System.out.println("This is college class staff() method");
    }
    public College()
    {
        System.out.println("This is College Constructor");
    }
    public static void main(String[] args) {
        RGPV obj = new College();
        obj.cctv();
        obj.lab();
        System.out.println("----------------------------------------");
        College obj1 = new College();
        obj1.staff();
        obj1.cctv();
        obj1.lab();
    }
}