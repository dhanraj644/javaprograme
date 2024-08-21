import java.util.Scanner;

class maxmin
 {
   
    public static void main(String[] args)
     {
         int i,j;
       int [] arr= new int[10];
        Scanner sc= new Scanner(System.in);

        
        for(i=0;i<10;i++)
        {
            System.out.println("enter value:"+(i+1));
            arr[i]=sc.nextInt();
        }

        for(i=0;i<10;i++)
        {
            for(j=i+1;j<10;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }

       
            System.out.println("min1"+arr[0]);
            System.out.println("min2"+arr[1]);
            System.out.println("min3"+arr[2]);

            System.out.println("max1"+arr[9]);
            System.out.println("max2"+arr[8]);
            System.out.println("max3"+arr[7]);
        

           
    }

    }

