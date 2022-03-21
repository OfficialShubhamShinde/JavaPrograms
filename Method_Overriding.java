package core_and_Advance_javaPrograms;

class a{
    public void meth1(){
        System.out.println("I am Method 1 in class A");
    }
}
class b extends a{
    @Override
    public void meth1() {
        System.out.println("I am a method 1 in class B");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        a A = new a();
        A.meth1();

        b B = new b();
        B.meth1();
    }
}
