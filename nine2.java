interface ex1
{
    final double discount=10;

     void getData();
     void procees();
     void putdata();
}
 class hello implements ex1
{
    String pName;
    double price,dis,total;

    void getData( String x, double y)
    {
     pName=x;
     price=y;
    }
    void process()
    {
        dis=(discount/price)/100;
        total=price-dis;
    }

    void putdata()
    {
        System.out.println("total ammount "+total);
        System.out.println("discount form ammount is 10%"+dis);
    }
}

public class nine2 {
    public static void main(Stirng args[])
    {
        ex2 obj=new ex2();
        obj.getData("raj",50000);
    }
}
