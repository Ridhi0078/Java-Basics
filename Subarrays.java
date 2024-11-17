import java.util.*;
public class Subarrays {
    public static void Sub_arrays(int arr[]){
        int ts=0;
        for (int i=0;i<arr.length;i++){
           int start=i;
           for (int j=i;j<arr.length;j++){
            int end=j;
            for(int k=start;k<=end;k++){
                System.out.print(arr[k]+" ");
            }
            ts++;
            System.out.println();
           }
           System.out.println();
        }
        System.out.println("The total number of subarrays are: "+ts);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        Sub_arrays(arr);
    }
}
