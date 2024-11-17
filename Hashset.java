import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("Ram");
        set.add("Shyam");
        set.add("Sita");
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
