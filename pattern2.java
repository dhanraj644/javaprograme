import java.util.Scanner;

class pattern2 {
public static void main(String[] args) {
    
    int n;

    Scanner sc=new Scanner(System.in);
    System.out.println("enter value for n");
    n=sc.nextInt();

    for(int i=1;i<=n;i++)
    {
        for(int j=i;j>=1;j--)
        {
           
            System.out.print(j);
        }
        System.out.println();
    }
}    
}
