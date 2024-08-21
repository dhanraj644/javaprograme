import java.util.Scanner;

class sumdigits {
        public static void main(String[] args) {
            
            int a,sum=0;

            Scanner sc=new Scanner(System.in);

            System.out.println("enter digits:");
            a=sc.nextInt();

            if(a<10)
            {
                System.out.println("number is one digit:"+a);
            }
            else
            {
            while(a!=0)
            {
            sum+=a%10;
            a=a/10;
            }
            System.out.println("sum of digits:"+sum);
        }
        }    
}
