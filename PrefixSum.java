import java.util.*;
public class PrefixSum {
    public static void PreSum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        //Calculate prefix Array
        for (int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for (int i=0;i<arr.length;i++){
           int start=i;
            for (int j=i;j<arr.length;j++){
               int end=j;
               currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
            if (maxSum<currSum){
                maxSum=currSum;
            }
        }
    }
    System.out.println("The maximum sum is: "+maxSum);
}
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        PreSum(arr);
    }
}
