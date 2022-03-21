package core_and_Advance_javaPrograms;
import java.util.Scanner;

public class fi_else_statement {
    public static void main(String[] args) {
        System.out.println("What is your age");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 18){
            System.out.println("u r not driving");
        }
        else{
            System.out.println("u can drive");
        }
    }
}
