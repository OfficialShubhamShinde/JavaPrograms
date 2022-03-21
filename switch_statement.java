package core_and_Advance_javaPrograms;
import java.util.Scanner;
public class switch_statement {
    public static void main(String[] args) {
        int age;
        System.out.println("What is your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("U can vote");
                break;
            case 23:
                System.out.println("U can married");
                break;
        }
        System.out.println("Thank u");
    }
}
