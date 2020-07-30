package slidingwindow;

public class minimumsubarraylength {
    public static int minsub(int arr[],int k) {
        
        
        int s=0;
        int sum=0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            while(sum>=k)
            {
                res=Math.min(res, i-s+1);
                sum-=arr[s++];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,2,3,2};
        int k=7;
        System.out.println(minsub(arr,k));
    }
}