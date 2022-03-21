package core_and_Advance_javaPrograms;

import java.util.ArrayDeque;

public class Array_Dequeue {
    public static void main(String[] args) {
        ArrayDeque <Integer> a1 = new ArrayDeque<>();
        a1.add(20);
        a1.add(22);
        a1.add(23);

        a1.addFirst(19);

        System.out.println(a1.getFirst());
        System.out.println(a1);
    }
}
