class BasicShape
{
    void display()
    {
        System.out.println("basic shape");
    }
}
class circle extends BasicShape
{
    void display()
    {
        System.out.println("this is circle");
    }
}
class polygon extends  BasicShape
{
    void display()
    {
        System.out.println("this is polugon");
    }

}
class Elispse extends BasicShape
{
    void display()
    {
        System.out.println("this is Elispse");
    }
}

public class inherit {
    public static void main(String[] args) {
        circle obj=new circle();
        polygon obj1=new polygon();
        Elispse obj2=new Elispse();
        obj.display();;
        obj1.display();
        obj2.display();
    }
}
