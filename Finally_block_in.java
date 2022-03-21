package core_and_Advance_javaPrograms;


public class Finally_block_in {
//    public static int great(){
//        try {
//            int a = 2;
//            int b = 0;
//            int c= a/b;
//        }
//        catch (Exception e){
//            System.out.println("This is Finally ans");
//        }
//        finally {
//            System.out.println("Welcome to finally function");
//        }
//        return 0;
//    }

    public static int great(){
        try {
            for (int i = 0; i<10; i++){
                System.out.println(i);
            }
            return 0;
        }catch (Exception e){
            System.out.println("Welcome");
        }
        finally {
            System.out.println("Hiiiiiiiiiiiiiiiiiiiiiii");
        }
        return 0;
    }


    public static void main(String[] args) {
        great();

    }
}
