package core_and_Advance_javaPrograms;

import java.util.Scanner;

public class Practise_set14 {
    public static void main(String[] args) {
        System.out.println("Enter your calculation");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = a - b;
        int e = a * b;
        int f = a / b;

        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
