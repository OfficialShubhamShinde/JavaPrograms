package core_and_Advance_javaPrograms;

import java.lang.reflect.Array;
import java.util.*;
public class ArrayList_In_Java {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(3);
        // for adding array count you add this new obj

        l1.add(20);
        l1.add(28);
        l1.add(25);
        l1.add(6);
        l1.add(0,21);
        // Here i am adding 21 in first no so index will 0

        l2.add(234);
        l2.add(345);
        l2.add(456);

        l1.addAll(l2);
        // for run l2

//        l2.clear();
        // for clear l2

//        System.out.println(l2.contains(765));
        // for using this int is in array or not

//        System.out.println(l2.indexOf(234));
        // for finding array index

//        System.out.println(l1.lastIndexOf());
//        for 2 array finding last array no

//        l2.set(0,28);
//        for adding no

//        for (int i = 0; i<l1.size(); i++){
//            System.out.println(l1.get(i));
            // this is original program

//        }

    }
}
