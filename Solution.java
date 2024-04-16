import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
            int flag=1;
          	
              for(int i=0;i<pattern.length();i++)
              {
                  char s=pattern.charAt(i);
                  if(s=='('||s==')'||s=='-'||s=='['||s==']'||s=='.'
                  ||s=='+')
                  {
                      flag =0;
                      break;
                  }
              }
              if(flag==1)
              {
                  System.out.println("Valid");
              }
              else{
                  System.out.println("Invalid");
              }
		}
	}
}