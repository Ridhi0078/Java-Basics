import java.util.Arrays;
import java.util.*;
public class ArraysSameorNot{

    public static boolean isSame(int arr1[],int arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int size=arr1.length;

        for(int i=0;i<size;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    } 
    public static void main(String[] args) {
        int arr1[]={1,2,5,4,7,6,8};
        int arr2[]={2,0,5,8,7,6,4};

        System.out.println(isSame(arr1, arr2));
    }
}