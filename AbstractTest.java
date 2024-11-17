abstract class AbstractClass{
    public AbstractClass(){
        System.out.println("This is a constructor");
    }
    abstract int add(int a,int b);

    int sub(int a,int b){
        return a-b;
    }

    static int multiply(int a,int b){
        return a*b;
    }
}


public class AbstractTest extends AbstractClass {

    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        AbstractTest a=new AbstractTest();
        int result1=a.add(10,20);
        int result2=a.sub(20,10);
        int result3=AbstractClass.multiply(10, 20);

        System.out.println("Addition: "+result1);
        System.out.println("Subtraction: "+result2);
        System.out.println("Multiplication: "+result3);
    }
}
