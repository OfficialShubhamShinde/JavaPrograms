package core_and_Advance_javaPrograms;

/**
 * This is my first java documentation and it is shown in oracle page at first time.
 * @author Shubham
 * @version 1
 * @since  2021
 * @see <a href= "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html"> Java Docs</a>
 */

public class Creat_Own_Java_Doc {
    /**
     *this methode portion created by me
     * @param a First number
     * @param b second number
     * @return sum of those number
     * @throws Exception if a = 0
     * @deprecated This method is deprecate please use + operator
     */
    public int add(int a, int b)throws Exception{
        if (a==0){
            throw new Exception();
        }
        int c;
        c = a+b;
        return c;
    }
    public static void main(String[] args) {
        System.out.println("I am main method");
    }
}
