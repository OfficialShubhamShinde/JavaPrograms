package core_and_Advance_javaPrograms;

import java.util.Scanner;

public class Nested_try_catch {
    public static void main(String[] args) {
        int [] marks = {0, 1, 2};
        marks [0] = 20;
        marks [1] = 28;
        marks [2] = 23;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int i = sc.nextInt();

        try {
            System.out.println(marks[i]);
            try {
                System.out.println("Wrong index" + marks[i]);
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Wrong");
            }
        }
        catch (Exception e) {
            System.out.println("V wrong");
        }
    }
}
