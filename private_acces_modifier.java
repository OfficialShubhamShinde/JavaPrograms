package core_and_Advance_javaPrograms;

class learn{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
}
public class private_acces_modifier {
    public static void main(String[] args) {
        learn shubham = new learn();
        shubham.setName("SAS");
        System.out.println(shubham.getName());

    }
}
