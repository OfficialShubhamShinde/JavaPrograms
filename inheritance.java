package core_and_Advance_javaPrograms;

class animal{
    String lion;
    String Tiger;

    public String getLion() {
        return lion;
    }

    public void setLion(String lion) {
        this.lion = lion;
    }

    public String getTiger() {
        return Tiger;
    }

    public void setTiger(String tiger) {
        Tiger = tiger;
    }
}
class pitanimal extends animal  {
    String dog;

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }
}
public class inheritance {
    public static void main(String[] args) {
        animal tiger = new animal();
        tiger.setTiger("Dhany");
        System.out.println(tiger.getTiger());

        animal lion = new animal();
        lion.setLion("Panthar");
        System.out.println(lion.getLion());

//        Here we can target first class to second but not target second to first


    }
}
