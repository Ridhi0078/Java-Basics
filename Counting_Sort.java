import java.util.*;
public class Counting_Sort {
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        //count arr will be an extra block. if largest is 7 then total block in count
        // array wil be 8
        int count[]=new int[largest+1];  
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;  // it will count the total frequency of each element
        }
        //sorting
        int j=0;
        for (int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }  
    }
    public static void Printarr(int arr[]) {
        for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");}
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        countingSort(arr);
        Printarr(arr);
    }
}
