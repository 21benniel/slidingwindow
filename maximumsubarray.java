package slidingwindow;

public class maximumsubarray {

    public static int  maxsw(int arr[],int k) {
        
        int sum=0;
        int res=0;
        int f=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(i>=k-1)
            {
                res=Math.max(res, sum);
                sum-=arr[f++];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,1,3,2}; 
        int k=3;
        System.out.println(maxsw(arr,k));
    }

}