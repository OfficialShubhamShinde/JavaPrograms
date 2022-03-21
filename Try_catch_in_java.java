package core_and_Advance_javaPrograms;

public class Try_catch_in_java {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        try {
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Failed input Reason: " );
            System.out.println(e);
        }
    }
}
