interface sayable{
    void say(String msg);
}

public class DieInterface implements sayable {
    public void say(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        DieInterface fie=new DieInterface();

        fie.say("Hello There");
    }
}
