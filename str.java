import java.util.Scanner;
class str{
    public static void main(String[] args) {
        
        String s1;
        	Scanner sc=new Scanner(System.in);
            s1=sc.nextLine();

            for(int i=0;i<s1.length();i++)
            {
                for(int j=0;j<s1.length();j++)
                {
                    System.out.print(s1.charAt(i));
                }
            }
    }
}