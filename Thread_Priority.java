package core_and_Advance_javaPrograms;

class Thrp extends Thread{
    public Thrp(String name){
        super(name);
    }
    public void run(){
        int i = 20;
        while (true) {
            System.out.println("This is no " + this.getName());
        }
    }
}
public class Thread_Priority {
    public static void main(String[] args) {
        Thrp t = new Thrp("Shubham1");
        Thrp t1 = new Thrp("Shubham2 (MIMP");
        Thrp t2 = new Thrp("Shubham3");
        Thrp t3 = new Thrp("Shubham4");

        t1.setPriority(Thread.MAX_PRIORITY);
        t.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
