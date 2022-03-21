package core_and_Advance_javaPrograms;

//problem 1:


/*
class cylender{
    int radius;
    int hight;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }
}
public class practise_set8 {
    public static void main(String[] args) {
        cylender mycylender = new cylender();
        mycylender.setRadius(9);
        System.out.println(mycylender.getRadius());

        mycylender.setHight(20);
        System.out.println(mycylender.getHight());
*/

//Problem 2:


        class cylender1{
            int radius;
            int hight;

            public cylender1(int radius, int hight) {
                this.radius = radius;
                this.hight = hight;
            }

            public int getRadius() {
                return radius;
            }

            public void setRadius(int radius) {
                this.radius = radius;
            }

            public int getHight() {
                return hight;
            }

            public void setHight(int hight) {
                this.hight = hight;
            }
            public double surfaceArea(){
                return 2*Math.PI*radius*radius+2*Math.PI*radius*hight;
            }
        }
        public class practise_set8 {
            public static void main(String[] args) {
                cylender1 mycylender = new cylender1(9,12);
//                mycylender.setRadius(9);
                System.out.println(mycylender.getRadius());

//                mycylender.setHight(12);
                System.out.println(mycylender.getHight());

                mycylender.surfaceArea();
                System.out.println(mycylender.surfaceArea());
    }
}
