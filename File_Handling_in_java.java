package core_and_Advance_javaPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling_in_java {
    public static void main(String[] args) throws IOException {
        /*

        // code to creat new file

        File f = new File("myfirstfile.txt");
        try {
            f.createNewFile();
        }catch (IOException e){
            System.out.println("Unable to cread");
            e.printStackTrace();
        }


        // cpde to write a file

        try {
            FileWriter fw = new FileWriter("myfirstfile.txt");
            fw.write("This is myfirst file now i am creat\n okay by");
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }


        // Reading a file

        File f1 = new File("myfirstfile.txt");
        try {
            Scanner sc = new Scanner(f1);
            while (sc.hasNextInt()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

*/

        // deleting file

        File f2 = new File("Readingfile.txt");
        if (f2.delete()){
            System.out.println("i have deleted" + f2.getName());
        }
        else {
            System.out.println("Some problem");
        }
    }
}
