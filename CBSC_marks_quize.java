package core_and_Advance_javaPrograms;
import java.util.Scanner;

public class CBSC_marks_quize {
    public static void main(String[] args) {
        System.out.println("Fill Marks u Obtained Here");
        Scanner sh = new Scanner(System.in);
        System.out.println("Marks botained in Chemistry");
        int chemistry = sh.nextInt();
        System.out.println("Marks botained in physics");
        int physics= sh.nextInt();
        System.out.println("Marks botained in maths");
        int maths = sh.nextInt();
        System.out.println("Marks botained in biology");
        int bio = sh.nextInt();
        System.out.println("Marks botained in zoology");
        int zoo = sh.nextInt();
        float percentage = ((chemistry + physics + maths + bio + zoo)/500.0f)*100;
        System.out.println("Percentage: ");
        System.out.println(percentage);

    }
}
