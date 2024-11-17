// Brute Force
public class MaxSubarraySum {
    public static void MaxSum(int arr[]){
        int currSum=0;
        int Maxsum=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            int start=i;
            for (int j=i;j<arr.length;j++){
                int end=j;
                currSum=0;
                for (int k=start;k<=end;k++){
                    currSum+=arr[k];
                }
                System.out.println(currSum);
                if (Maxsum<currSum){
                    Maxsum=currSum;
                }
            }
        }
        System.out.println("Maximum sum of subarrays are: "+Maxsum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        MaxSum(arr);
    }
}
