package core_and_Advance_javaPrograms;

import java.util.Scanner;

public class Handling_specific_Exeption{
    public static void main(String[] args) {
        int [] marks = {0, 1, 2};
        marks [0] = 20;
        marks [1] = 21;
        marks [2] = 22;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array index: ");
        int ind = sc.nextInt();


        try {
            System.out.println("Entered array index value is: " + marks[ind]);


            System.out.println("Which no want divides u");
            int number = sc.nextInt();

            System.out.println("Ans is: " + marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occured");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Exception found");
            System.out.println(e);
        }
    }
}
