package core_and_Advance_javaPrograms;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am a toString";
    }

    @Override
    public String getMessage() {
        return  "I am a getMessage";
    }

}
public class Exception_class {
    public static void main(String[] args) {
        int a = 3;
        if (a<9){
            try {
                throw new MyException();
//              This is IMP
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
            }
        }
    }
}
