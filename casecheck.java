import java.util.Scanner;

public class casecheck {

    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);

        char a=in.next().trim().charAt(0);


        if(a>'a' && a<'z')
        {
            System.out.println("lower case");
        }
        else{
            System.out.println("uppercase");
        }

    }
    
}
