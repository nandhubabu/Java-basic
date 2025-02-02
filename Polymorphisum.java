//import java.util.*;

abstract class Shape {

    public abstract void side();
}
class Triangle extends Shape{
    public void side(){
        System.out.println("Triangle has 3 side");
    }
}
class Squre extends Shape{
    public void side(){
        System.out.println("Squre has 4 sids");
    }
}
class Pentagon extends Shape{
    public void side(){
        System.out.println("Pentagon has 5 sides");
    }
}

public class Polymorphisum {

    public static void main(String[] args)
     {
        Shape t=new Triangle();
        Shape s=new Squre();
        Shape p=new Pentagon();

        t.side();
        s.side();
        p.side();
    }
}