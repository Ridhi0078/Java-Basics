import java.util.Scanner;
public class Array {
    public static void Update(int marks[],int nonChangeable){
        nonChangeable=5;
        for (int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int nonChangeable=10;
        int marks[]={97,98,99};
        Update(marks,nonChangeable);
        System.out.println(nonChangeable);

        for (int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
    
}
