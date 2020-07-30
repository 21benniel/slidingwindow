package slidingwindow;

import java.util.Arrays;

/**
 * average
 */
public class average {
    public static double[]  sw(int arr[],int k) {
        double[] a=new double[arr.length-k+1];
        double sum=0;
        int x=0;
        int f=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(i>=k-1)
            {
                a[x++]=sum/k;
                sum-=arr[f++];
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[]={1, 3, 2, 6, -1, 4, 1, 8, 2}; 
        int k=5;
        System.out.println(Arrays.toString(sw(arr,k)));
    }
}