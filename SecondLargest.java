import java.util.*;
public class SecondLargest {
    public static int[] print2largest(int arr[]) {
        int n=arr.length;
        // code here
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++){
            System.out.println(arr);
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={2,4,5,13,6,7};
        System.out.println(print2largest(arr));
    }
    
}
