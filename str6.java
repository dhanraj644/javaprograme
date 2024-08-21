import java.util.Scanner;
public class str6 {
    public static void main(String[] args) {
        
        String str1;
        char c;
        int n;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter string ");
        str1=sc.nextLine();
        System.out.println("enter character");
        c=sc.next().charAt(0);
        System.out.println("enter numbers for run time");
        n=sc.nextInt();
        for(int i=1;i<=n-1;i++)
        {
            System.out.print(str1);
            System.out.print(c);
            
        }
        System.out.println(str1);
    }
    
}
