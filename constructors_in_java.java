package core_and_Advance_javaPrograms;

class statement{
    statement(int a){
        System.out.println("Hellow i am shubham shinde: " + a);
    }
}
class statement1 extends statement{
    statement1(){
        super(20);
        System.out.println("hello");
    }
}
public class constructors_in_java {
    public static void main(String[] args) {
        statement1 st = new statement1();

    }
}
