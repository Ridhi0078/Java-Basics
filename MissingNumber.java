public class MissingNumber {
    public static int missing(int arr[],int N){
        int s=0;
        int sum=0;
        int sum1=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }

        for(int x=1;x<=N;x++){
            sum1=sum1+x;
        }

        if(sum1>sum){
            s=sum1-sum;
        }
        return s;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int N=5;
        System.out.println(missing(arr, N));
    }
}
