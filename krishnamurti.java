import java.util.Scanner;

class krishnamurti {

    public static void main(String[] args) {
        int n,fact=1,rem=0,k,sum=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number");
        n=sc.nextInt();
        k=n;

       while(n!=0)
       {
         rem=n%10;
            fact=1;
         for(int i=1;i<=rem;i++)
         {
            fact=fact*i;
         }
          sum=sum+fact; 
         n=n/10;
       }
       if(k==sum)
       {
        System.out.println("this number is krishnamurti number:"+sum);
       }
       else{
        System.out.println("this number is not krishnamurti number:"+sum);
       }
    }
}
