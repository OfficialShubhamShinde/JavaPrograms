package core_and_Advance_javaPrograms;

interface MyBicycle1{
    void speedUp(int increment);
    void applyBreak(int decrement);
    default void stunt(){
        System.out.println("stuntttt");
    }
//    Here Added default method to start the sentence add default add bottom initialize it
}
interface YourBicycle{
    void slow();
    void fast();
}
class MyavonCycle1 implements MyBicycle1,YourBicycle{
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

    public void fast() {
        System.out.println("bhuuunngggggggggg");
    }

    @Override
    public void slow() {
        System.out.println("sllloooowwwwwwwwww");
    }
}
public class Polymorphism_in_Interface {
    public static void main(String[] args) {
        MyBicycle1 cycle = new MyavonCycle1();

//        cycle.fast(); ---> not allows

//        cycle.blowHorn(); --> not allows

        cycle.speedUp(7);
    }
}