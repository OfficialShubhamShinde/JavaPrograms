package core_and_Advance_javaPrograms;

class Mythread1 extends Thread{
    public void run(){
        while (true) {
            System.out.println("I am Threading 1");
        }
    }
}
class Mythread2 extends Thread{
    public void run(){
        while (true){
            System.out.println("I am thhreading 2");
        }
    }
}
public class Threading_through_class {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();

    }
}
