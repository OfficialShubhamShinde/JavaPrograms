package core_and_Advance_javaPrograms;
import java.util.Scanner;

public class exercise_2 {
    public static void main(String[] args) {
        System.out.println("Enter Your choise");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
//        int game;
//        int eraser;
//        int paper5;
        switch (i){
            case 2:
            System.out.println("win reasser");
            break;
            case 1:
                System.out.println("Win Paper");
                break;
            case 5:
                System.out.println("Win win reasser");
                break;
        }
    }
}
