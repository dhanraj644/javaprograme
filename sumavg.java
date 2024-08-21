import java.util.Scanner;

class sumavg {
    public static void main(String args[])
    {
        int sum=0,n;
        float avg=0;
        Scanner sc= new Scanner(System.in);

        for(int i=0;i<10;i++)
        {
            System.out.println("enetr value:"+(i+1));
            n=sc.nextInt();

            sum+=n;
            avg=(float)sum/10;
        }
        System.out.println("sum of values:"+sum);
        System.out.println("avg of values:"+avg);
    }
    
}
