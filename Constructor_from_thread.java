package core_and_Advance_javaPrograms;
class mythr extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){
        int i  = 20;
        String s = "Shubham";
//        String = "Shubham";
        System.out.println("it is constructor from thread " + getId());
        System.out.println("it is constructor from thread " + getName());

    }
}
public class Constructor_from_thread {
    public static void main(String[] args) {
        mythr m = new mythr("shubham");
        m.start();
    }
}
