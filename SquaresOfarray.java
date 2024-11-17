import java.util.*;
public class SquaresOfarray {
    public static int[] sortedSquares(int nums[],int n){
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=nums[i]*nums[i];
        }
        Arrays.sort(res);
        return res;
    } 
    /*public static void Printarr(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            System.out.print(nums+" ");
        }
        System.out.println();
    }*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int nums[]=new int[m];
        for(int i=0;i<m;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(sortedSquares(nums,m));
    }
}
