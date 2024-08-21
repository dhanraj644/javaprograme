public class primechacker {
    public static void main(String[] args) {
       counter(3);
    }
    public static void counter(int a)
    {
        int count=0;
        for(int i=0; i<400;i++)
        {
            if(isPrime(i))
            {
                count++;
                if(count == a)
                {
                    System.out.println(i);
                }
                
            }
        }
    }
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        int c=2;
        while (c*c<=n) {
            if(n%c==0)
            {
                return false;
            }
            c++;
        }
        if(c*c > n)
        {
            return true;
        }
        return false;
    }
}
