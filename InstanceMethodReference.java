interface Sayable{
    void say();
}

public class InstanceMethodReference{
    public  void saySomething(){
        System.out.println("This is a instance method");
    }

    public static void main(String[] args) {
        //InstanceMethodReference MethodReference=new InstanceMethodReference();
        //By using anonymous class.
        Sayable sayable=new InstanceMethodReference()::saySomething;
        sayable.say();
    }
    
}
