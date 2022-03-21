package core_and_Advance_javaPrograms;

import java.util.*;

public class LinkedList_in_java {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        // for adding array count you add this new obj

        l1.add(20);
        l1.add(28);
        l1.add(25);
        l1.add(6);

        l2.add(234);
        l2.add(345);
        l2.add(456);

        for (int i = 0; i<l1.size(); i++) {
            System.out.println(l1.get(i));
//            System.out.println(l2);
        }
    }
}
