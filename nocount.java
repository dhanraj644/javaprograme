public class nocount {
    
    public static void main(String[] args) {
        
       int a=122652452;
       int count=0;
       int c=5;

       while(a>0)
        {
            int rem =a%10;

            if(c==rem)
            {
                count++;
            }
            a=a/10;
        }

System.out.println(count);
       
    }
}
