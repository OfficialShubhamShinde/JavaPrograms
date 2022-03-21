package core_and_Advance_javaPrograms;

//class Employee1{
//    int id;
//    int salary;
//    String name;
////    public void printdetails(){
////        System.out.println("Your id is: " + id);
////        System.out.println("Your Name is: " + name);
////        System.out.println("Your Salary is: " + salary);
////    }
//    public int getSalary(){
//        return salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public void setSalary(int n){
//        salary = n;
//    }
//    public void setName(String n){
//        name = n;
//    }
//}
//public class practise_set7 {
//    public static void main(String[] args) {
//        Employee1 shubham = new Employee1();
////        shubham.id = 20;
////        shubham.name = "SAS";
//
//        shubham.salary = 50;
//        shubham.setName("shubham");
//        System.out.println(shubham.getName());
//        System.out.println(shubham.getSalary());

//        problem 2:

class Cellphone{
    String calling;
    String ringing;
    String vaibrating;

    public void call(){
        System.out.println("Calling...");
    }
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
}
        public class practise_set7 {
        public static void main(String[] args) {
            Cellphone apple = new Cellphone();
            apple.ring();
            apple.call();
            apple.vibrate();
        }

}
