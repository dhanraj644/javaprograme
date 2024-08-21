import java.util.Scanner;

public class str9 {
    
    public static void main(String[] args) {
        String str;
        char r1,r2;

        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        str=sc.nextLine();

        System.out.println("enetr replace char");
        r1=sc.next().charAt(0);

        System.out.println("Enter replacement char");
        r2=sc.next().charAt(0);


        System.out.println("without replacement \n"+str);

        System.out.println("with replacement : \n"+str.replace(r1,r2));
    }
}
