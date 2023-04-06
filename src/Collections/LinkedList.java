package Collections;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> ll1=new java.util.LinkedList<>();
        ll1.add("h");
        ll1.add("k");
        ll1.add("m");
        ll1.add("hü");
        System.out.println(ll1);
        //Linklist list, Queue, Deque yi imlement etmiştir.
        List<String> ll2=new java.util.LinkedList<>();
        ll2.add("r");
        ll2.add("b");
        ll2.add(2,"h");

        System.out.println(ll1.addAll(2, ll2));
        System.out.println(ll1);



    }
}
