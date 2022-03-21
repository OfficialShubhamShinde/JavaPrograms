package core_and_Advance_javaPrograms;

class circle{
    String radius;
    String diameter;

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }
}
class cylinder extends circle{
    public String getRadius() {
        return radius;
    }
    public void setRadius(String radius) {
        this.radius = radius;
    }
}
public class Practice_set9 {
    public static void main(String[] args) {
        circle round = new circle();
        round.setRadius("Helooooo");
        System.out.println(round.getRadius());
    }
}
