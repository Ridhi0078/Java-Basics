// Default and Static methods inside Java 8 Interface
interface sayable{
    //Default Method
    default void say(){
        System.out.println("This is a default method");
    }
    //Abstract method
    void sayMore(String msg);

    //Static Method
    static void sayLouder(String msg){
        System.out.println(msg);
    }
}

public class DefaultMethods implements sayable{
    public void sayMore(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        DefaultMethods dm=new DefaultMethods();
        dm.say();
        dm.sayMore("Hello.. this is an abstract method");
        sayable.sayLouder("Hello..this is a static method");
    }
}
