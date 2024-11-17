interface MyInterface{
    default void DefaultMethod(){
        System.out.println("this is a default Method");
    }

    static void StaticMethod(String msg){
    System.out.println(msg);
    }
}

public class MyClass implements MyInterface{
    public static void main(String[] args) {
        MyClass a=new MyClass();
        a.DefaultMethod();
        MyInterface.StaticMethod("This is a Static method");
    }
    
}
