public class LinearSearch {
    public static int Linear_search(int arr[],int key){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int key=8;
        int index=Linear_search(arr,key);
        if (index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element is found at index: "+index);
        }   
    }
}
