import java.util.Scanner;
public class str8 {
    public static void main(String[] args) {
        String str;
         int co=0,count=0,sp=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter string ");
        str=sc.nextLine();

        for(int i=0;i<str.length();i++)
        {
            char s=str.charAt(i);
            if(s=='A'||s=='a'||s=='E'||s=='e'||s=='I'||s=='i'||s=='O'||s=='o'||s=='U'||s=='u')
            {
                
                count++;
            }
            else if(s==' ')
            {
                   sp++; 
            }
            else{
               
                co++;
            }
            
        }
        System.out.println("Vowels letter are in string :"+count);
        System.out.println("consonants letter are in string :"+co);      
        System.out.println("space in string :"+sp);   
        double total=count*100/str.length();
        System.out.println("vowels percentage :"+total);
        double total1=co*100/str.length();
        System.out.println("consonants percentage :"+total1);
    }
}
