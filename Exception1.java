public class Exception1 {
    public static void main(String[] args) {
        try{
            int a=10/0;
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
