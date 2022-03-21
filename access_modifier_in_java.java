package core_and_Advance_javaPrograms;

class c1{
    public int a = 2;
    private int b = 3;
    protected int c = 4;
    int d = 5;

    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class access_modifier_in_java {
    public static void main(String[] args) {
        c1 c = new c1();
//        c.meth1();
//        here all are run in same class

        System.out.println(c.a);
//        System.out.println(c.b);
//        here b means private modiffier it is not exicute but others are exicute
        System.out.println(c.c);
        System.out.println(c.d);
    }
}
