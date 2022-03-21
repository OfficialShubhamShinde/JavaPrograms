package core_and_Advance_javaPrograms;

interface Bicycle{
    void speedUp(int increment);
    void applyBreak(int decrement);
}
class avonCycle implements Bicycle{
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
public class interface_in_java {
    public static void main(String[] args) {
        avonCycle cycle = new avonCycle();
        cycle.blowHorn();
        cycle.applyBreak(2);
        cycle.speedUp(3);
    }
}
