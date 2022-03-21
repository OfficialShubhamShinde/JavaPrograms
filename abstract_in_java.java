package core_and_Advance_javaPrograms;

abstract class abstracts{
    public abstracts(){
        System.out.println("I am a Abstract");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greet();
}
class abstracts2 extends abstracts{
    @Override
    public void greet() {
        System.out.println("Good Morning....!");
    }
}
public class abstract_in_java {
    public static void main(String[] args) {

    }
}
