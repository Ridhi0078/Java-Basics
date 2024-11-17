import java.util.*;
public class Largestno {
    public static int Largest_no(int numbers[]){
        int largest=Integer.MIN_VALUE; //-Infinity
        int smallest=Integer.MAX_VALUE; //+Infinity
       for (int i=0;i<numbers.length;i++){
        if (largest<numbers[i]){
            largest=numbers[i];
        }
        if (smallest>numbers[i]){
            smallest=numbers[i];
        }
       } 
       System.out.println("The smallest value is:"+smallest);
       return largest;
    }
    public static void main(String[] args) {
        int numbers[]={5,7,4,3,9,1,2};
        System.out.println("The largest number is: "+Largest_no(numbers));
    }
}
