package core_and_Advance_javaPrograms;

class employee {
        int id;
        String name;

        public void printdetail() {
            System.out.println("My id is: " +id);
            System.out.println("My name is: " + name);


        }
    }
    public class classes_in_java {
    public static void main(String[] args) {
        employee shubham = new employee();
        employee rohan = new employee();



        shubham.id = 20;
        shubham.name = "shinde";

        rohan.id = 6;
        rohan.name ="R Shinde";

        shubham.printdetail();
        rohan.printdetail();

    }
}