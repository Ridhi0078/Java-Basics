public class Twice {
    public static boolean isSame(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={8,4,3,2,1};
        System.out.println(isSame(arr));
    }
}
