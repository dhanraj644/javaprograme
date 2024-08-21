 import java.util.Scanner;

 class prime {
    public static void main(String[] args) {
        
        int a;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number");
        a=sc.nextInt();

        if(a%2==1 && a%a==0)
        {
            System.out.println("it is prime number"+a);
        }
        else
        {
            System.out.println("it is not prime number"+a);
        }

    }    
}
