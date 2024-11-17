public class Reverse {
    public static void Reverse_Array(int arr[]){
       int first=0;
       int last=arr.length-1;
       while(first<last){
        int temp=arr[last];
        arr[last]=arr[first];
        arr[first]=temp;
        
        first++;
        last--;
       }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Reverse_Array(arr);
        for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
}
