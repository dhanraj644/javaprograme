import java.util.Scanner;

class armstrong {

    public static void main(String[] args) {
        
        int a,rem=0,arm=0;
            Scanner sc = new Scanner(System.in);
        
            System.out.println("enter number:");
            a=sc.nextInt();
            int n=a;
            while(a!=0)
            {
                rem=a%10;   
                arm+=rem*rem*rem;
                a=a/10;
            }

            if(arm == n)
            {
                System.out.println("it is armstrong number:"+ arm);
            }
            else{
                System.out.println("it is not armstrong number"+ n);
            }


    }
}
