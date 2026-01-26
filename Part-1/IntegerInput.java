
//import java.util.Scanner;
// in this we will learn ho to take input in java
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // write your program here
//        System.out.println("Give a number: ");
//        int number = Integer.valueOf(scanner.nextLine());
//        System.out.println("You gave the number "+number);
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave the number "+number);
        
    }
}
