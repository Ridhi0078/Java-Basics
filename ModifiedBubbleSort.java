public class ModifiedBubbleSort {
    public static void modifiedBubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            boolean swapped=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
    public static void Printarr(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={7,2,4,3,5,6};
        modifiedBubble(arr);
        Printarr(arr);
    }
}
