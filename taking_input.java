package core_and_Advance_javaPrograms;
import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        System.out.println("Taking input form user");
        Scanner sh = new Scanner (System.in);
        System.out.println("Enter Number 1");
        int a = sh.nextInt();
        System.out.println("Enter Number 2");
        int b = sh.nextInt();
        int sum = a + b;
        System.out.println("Sum of These Number is: ");
        System.out.println(sum);
    }
}
