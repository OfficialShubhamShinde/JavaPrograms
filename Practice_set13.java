package core_and_Advance_javaPrograms;

class thr extends Thread{
    public void run(){
        int i = 20;
//        while (true){
            System.out.println("Good Morning!" + getId());
        System.out.println("Good Morning!" + getName());
//        }
    }
}
class thr1 extends Thread{
    public void run(){
//        while (true){
//            try {
//                Thread.sleep(5);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
            System.out.println("Welcome");
//        }
    }
}
public class Practice_set13 {
    public static void main(String[] args) {
        thr t = new thr();
        thr1 t1 = new thr1();
        t.start();
        t1.start();

        t.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.getState();
    }
}
