class Primeseriece
{
    public static void main(String args[])
    {
        int n=100;
        boolean [] arr =new boolean[n];
        prime(arr,n);
    }
    public static boolean prime(boolean[] arr,int n)
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=true;
        }

        arr[1]=arr[0]=false;

      for(int k=2;k*k<=n; k++)
      {
        
      }
    }
}