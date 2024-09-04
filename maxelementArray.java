public class maxelementArray {
    public static void main(String[] args) {
        int arr[]={5,7,1,3,9,10,41,60};
        int max =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    
}
