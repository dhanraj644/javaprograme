import java.util.Scanner;

class revers {
    public static void main(String[] args) {
        
        int a,revers=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a digits");
        a=sc.nextInt();

       if(a<10)
       {
        System.out.println("number is one digit :"+a);
       }
       else{
         while(a!=0)
        {
         int rem =a%10;
         revers=revers*10+rem;
         a=a/10;
        }
        System.out.println("reverse of digits :"+revers);
       }

    }    
}
