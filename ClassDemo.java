import java.io.*;
import java.util.Scanner;

public class ClassDemo{

    public static void main(String[] args)throws FileNotFoundException{
        File file = new File("fileName.txt");  //declares which file to read from
        Scanner scanner = new Scanner(file);  //declares how you are inputting data.

        //Read each line of the file - but this time, read it piece by piece
         
     
        //How are you going to store this data?


        //Print out the information using an enhanced for loop!
   
        scanner.close();
    }
}