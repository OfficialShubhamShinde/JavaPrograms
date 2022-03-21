package core_and_Advance_javaPrograms;

class Myrunable implements Runnable{
    public void run(){
        System.out.println("I am a runable");
    }
}
public class Threading_through_Runable {
    public static void main(String[] args) {
        Myrunable m1 = new Myrunable();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
