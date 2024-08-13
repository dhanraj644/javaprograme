import java.lang.reflect.Array;

class thirdlargeststring
{
    public static void main(String[] args) {
     
     String arr[]={"code","coder","byte","chandan","dhanrajjhj"};
           
     for(int i=0;i<arr.length;i++)
     {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i].length()>arr[j].length())
            {
                       String temp =arr[j];
                       arr[j]=arr[i];
                       arr[i]=temp;
            }
        }
     }
     int a=arr.length-2;
     System.out.println("third largest word:"+arr[a]);
    }

}