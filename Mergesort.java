public class Mergesort {
    public static void main(String[] args) {
        int arr[]={5,7,1,3,9,10,4};
        int s=0;
        int e=arr.length-1;

        divide(arr, s, e);
        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
    }
    public static void divide(int arr[],int s,int e)
    {
        if(s>=e)
        {
            return;
        }
        int  mid= s+(e-s)/2;
        divide(arr, s, mid);
        divide(arr, mid+1, e);
        merges(arr,s,mid,e);
    }
    public static void merges(int arr[],int s, int mid,int e)
    {
        int mergear []= new int[e-s+1];
        int ind1=s;
        int ind2=mid+1;
        int x=0;

        while (ind1<=mid && ind2<=e) {
            if(arr[ind1]<=arr[ind2])
            {
                mergear[x++]=arr[ind1++];
            }
            else
            {
                mergear[x++]=arr[ind2++];
            }
            
        }
        while (ind1<=mid) {
            mergear[x++]=arr[ind1++];
        }
        while (ind2<=e) {
            mergear[x++]=arr[ind2++];
            
        }

        for(int i=0, j=s; i<mergear.length;i++,j++)
        {
            arr[j]=mergear[i];
        }

        
    }
}
