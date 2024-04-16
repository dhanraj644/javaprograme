import java.util.Scanner;

public class dayswitch {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day in digit:");
        int n=sc.nextInt();

        switch (n) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wenesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println ("Friday");
            case 6 -> System.out.println("Satrday");
            case 7 -> System.out.println("sunday");

            default -> System.out.println("Envalid");

        }

    }
    
}
