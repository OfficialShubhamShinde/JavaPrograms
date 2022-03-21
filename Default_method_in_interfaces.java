package core_and_Advance_javaPrograms;

interface MyBicycle{
    void speedUp(int increment);
    void applyBreak(int decrement);
    default void stunt(){
        System.out.println("stuntttt");
    }
//    Here Added default method to start the sentence add default add bottom initialize it
}
class MyavonCycle implements MyBicycle{
    void blowHorn(){
        System.out.println("Peee peeee....");
    }

    @Override
    public void applyBreak(int decrement) {
        System.out.println("Applying Break");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("breeeekkkkk!!!!!");
    }
}
public class Default_method_in_interfaces {
    public static void main(String[] args) {
        MyavonCycle cycle = new MyavonCycle();
        cycle.blowHorn();
        cycle.applyBreak(2);
        cycle.speedUp(3);
        cycle.stunt();

    }
}
