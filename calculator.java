import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        
        int ans=0;

        Scanner sc  =new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter operator");
            char op=sc.next().trim().charAt(0);

            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%')
            {
                System.out.println("Enter a number :");
                int a=sc.nextInt();
                int b=sc.nextInt();

                if(op =='+')
                {
                    ans=a+b;
                }
                if(op=='-')
                {
                    ans=a-b;
                }
                if(op=='*')
                {
                    ans=a*b;
                }
                if(op=='/')
                {
                    if (b!=0) {
                        ans=a/b;
                    }
                }
                if(op=='%')
                {
                    ans=a%b;
                }

                System.out.println(ans);
            }

            else if(op=='x'||op=='X')
            {
                break;
            }
            else{
                System.out.println("invalid operator");
            }
            
        }
    }
    
}
