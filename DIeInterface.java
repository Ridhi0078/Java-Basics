interface sayable{
    void say(String msg);
}

public class DIeInterface implements sayable {
    public void say(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        DIeInterface fie=new DIeInterface();

        fie.say("Hello There");
    }
}
