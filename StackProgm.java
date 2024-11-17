import java.util.*;
public class StackProgm {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st);
        Stack<Integer> t=new Stack<>();
        while(!st.isEmpty()){
            t.push(st.pop());
        }

        st.push(60);

        while(!t.isEmpty()){
            st.push(t.pop());
        }

        System.out.println(st);
    }
}
