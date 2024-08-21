import java.util.Scanner;

class polindrom{
    public static void main(String[] args) {
        
        int a,revers=0,rem=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a digits");
        a=sc.nextInt();
        int n=a;

        while(a!=0)
        {
          rem =a%10;
         revers=revers*10+rem;
         a=a/10;
        }
       if(n==revers)
       {
        System.out.println("polidrom no. :"+revers);
       }
       else{
        System.out.println("not polindrom no :"+revers);
       }
       

    }    
}
