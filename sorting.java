import java.util.Scanner;

class sorting {
    public static void main(String[] args) {
        int [] arr=new int[10];

            Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.println("enter no. in "+(i+1));
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<10;i++)
            {
                for(int j=i+1;j<10;j++)
                {
                
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                 }
            }
       
            for(int i=0;i<10;i++)
            {
                System.out.println("assending order"+arr[i]);
            }
    }    
}
