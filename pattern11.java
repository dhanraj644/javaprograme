public class pattern11 {
   public static void main(String args[])
    {
        int a=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(a%2);
                a++;
            }
            System.out.println();
        }

    }  
}


