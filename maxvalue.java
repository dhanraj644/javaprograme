import java.util.Scanner;

class maxvalue
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);

        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
         int max;

        //  if (b>max)
        //  {
        //     max=a;

        //  }
        //  if(c>max)
        //  {
        //     max=c;
        //  }

        //  System.out.println(max);


     max=Math.max(a, Math.max(b, c));

     System.out.println(max);

    }
}