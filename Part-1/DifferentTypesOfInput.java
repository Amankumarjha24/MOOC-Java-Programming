
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
//        System.out.println("Give a string:");
//        
//        String responce = scan.nextLine();
//        System.out.println("Give an integer:");
//        int value = Integer.valueOf(scan.nextLine());
//        System.out.println("Give a double:");
//        double point_value = Double.valueOf(scan.nextLine());
//        System.out.println("Give a boolean:");
//        boolean t_and_f = Boolean.valueOf(scan.nextLine());
//        
//        System.out.println("You gave the string "+ responce);
//        System.out.println("You gave the integer " +value);
//        System.out.println("You gave the double "+ point_value);
//        System.out.println("You gave the boolean "+t_and_f);

// In this we are going to take different types of input and also print them 

        System.out.println("Give a string:"); // Taking string input 
        String responce = scan.nextLine();
        System.out.println("Give an integer:"); // Taking a intenger 
        int value = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:"); // Taking a double value 
        double point_value = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean: "); // Taking a boolean value
        boolean t_and_f = Boolean.valueOf(scan.nextLine());
        
//        Now print the values 

        System.out.println("You gave the string: " + responce);
        System.out.println("You gave the integer "  + value);
        System.out.println("Your gave the double " + point_value);
        System.out.println("You gave the boolean: " + t_and_f);
    }
}
