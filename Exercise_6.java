package core_and_Advance_javaPrograms;

import java.util.Scanner;

class calcu{
    int a;
    int b;
    public void calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your values u want to calculate: ");
        int i = sc.nextInt();
        System.out.println("Enter First Value");
        int b = sc.nextInt();
        System.out.println("Enter Second Value");
        int c = sc.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
    }
}
public class Exercise_6 {
    public static void main(String[] args) {
        calcu c = new calcu();
        c.calculate();
    }
}
