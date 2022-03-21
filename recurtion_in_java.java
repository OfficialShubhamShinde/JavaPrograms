package core_and_Advance_javaPrograms;


public class recurtion_in_java {
    static int recurtion(int a){
        if (a==0 || a==1){
            return 1;
        }
        else {
            return a * recurtion(a-1);
        }
    }

    public static void main(String[] args) {
        int x = 4;
        System.out.println(recurtion(x));
    }
}
