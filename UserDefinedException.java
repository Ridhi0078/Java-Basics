import java.lang.Exception;

class InvalidAge extends Exception{
    public InvalidAge(String message){
        super(message);
    }
}
public class UserDefinedException {
    public static void main(String[] args) {
        int age=12;
    try{
        CheckAge(age);
    }catch(InvalidAge e){
        System.out.println(e.getMessage());
    }
}
    public static void CheckAge(int age) throws InvalidAge{
        if(age<18){
            throw new InvalidAge("Your age is invalid");
        }
        System.out.println("your age is valid");
    }
}
