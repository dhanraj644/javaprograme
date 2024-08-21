import java.util.Scanner;
class pattern9 {
    public static void main(String args[])
    {
        int n,a=1;
        Scanner sc =new Scanner(System.in);

        System.out.println("enter range of pattern");
        n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+a);
                a++;
                
            }
            System.out.println();
        }

    }    
}
