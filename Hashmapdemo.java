import java.util.*;
public class Hashmapdemo {
    public static void main(String[] args) {
       /*  HashMap<String,String> hm=new HashMap<>();
        hm.put("key1","Ram");
        hm.put("key2","sita");
        hm.put("key3","Radha");
        hm.put("key4","shyam");
        for(Map.Entry m:hm.entrySet()){
    System.out.println(m.getKey()+" "+m.getValue());
    }*/

       TreeMap<String,String> tm=new TreeMap<>();
       tm.put("key1","ram");
       tm.put("key2","sita");
       tm.put("key3","Radha");
       tm.put("key4","shyam");

       for(Map.Entry m:tm.entrySet()){
        System.out.println(m.getKey()+" "+m.getValue());
       }
        
    }
}
