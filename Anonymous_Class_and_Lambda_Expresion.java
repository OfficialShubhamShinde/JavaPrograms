package core_and_Advance_javaPrograms;

@FunctionalInterface   // in functional interface only one methode in it
interface DemoAno{
    void meth1();
//    class LambdaE implements DemoAno{
//        @Override
//        public void meth1() {
//            System.out.println("I Am meth1 in lambda exprestion");
//        }
//    }
//    void meth2();
}
//class AnonyDemo implements DemoAno{
//    @Override
//    public void meth1() {
//        System.out.println("I am meth 1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth 2");
//    }
//}

public class Anonymous_Class_and_Lambda_Expresion {
    public static void main(String[] args) {
//        AnonyDemo a = new AnonyDemo();
//        a.meth1();

        // Anonymous Class

//        DemoAno d = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth1 in Anonymous class");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am meth2 in Anonymous Class");
//            }
//        };
//        d.meth1();

        // Lambda Expresion'
        DemoAno d = ()->{
            System.out.println("I am lambda ex after main method");
        };
        d.meth1();
    }
}
