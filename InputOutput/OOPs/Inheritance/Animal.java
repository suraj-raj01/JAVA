
class Dog{
    int x = 100;
    Dog()
    {
        System.out.println("Barking...");
    }
}
class Cat extends Dog{
    int y = 200;
    Cat()
    {
        System.out.println("Meauuuu...");
    }
}
class Animals extends Cat{
    int z = 300;
    Animals()
    {
        System.out.println("Sleeping...");
    }
    public void show()
    {
        System.out.println("Dog number: "+super.x);
        System.out.println("Cat number: "+super.y);
        System.out.println("Animals number: "+z);
    }
}

public class Animal {
    public static void main(String[] args) {
        Animals obj = new Animals();
        obj.show();
    }
}
