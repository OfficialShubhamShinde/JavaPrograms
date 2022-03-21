package core_and_Advance_javaPrograms;

class phone{
    public void music(){
        System.out.println("Play a music....");
    }
}
class Smartphone extends phone{
    public void music() {
        System.out.println("Volume up....");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        phone obj = new Smartphone();
        obj.music();
        // Run Class 2 methode

    }
}
