package core_and_Advance_javaPrograms;

public class Throw_Throws{
    public static int devide(int a, int b)throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
            int c= devide(2,0);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
}
