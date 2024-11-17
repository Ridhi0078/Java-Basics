import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Ram");
        list.add("Shyam");
        list.add("Radhika");
        list.add("Sita");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
