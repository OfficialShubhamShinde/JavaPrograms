package core_and_Advance_javaPrograms;

public class methods_in_java {
    static int formula(int x, int y) {
        int z;
        if (x>y){
            z = x+ y;
        }
        else {
            z = x - y;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c;
       c = formula(a, b);
        int a1 = 12;
        int b1 = 10;
        int c1;
        c1 = formula(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
