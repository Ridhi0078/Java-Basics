public class BinarySearch {
    public static int binary_Search(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (arr[mid]==key){
                return mid;
            }
            if (arr[mid]<key){ //right
                start=mid+1;
            }else{ //left
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int key=7;
        System.out.println("The index for the key: "+binary_Search(arr, key));
    }
}
