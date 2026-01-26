
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
//        System.out.println("Give a number:");
//        double number = Double.valueOf(scanner.nextLine());
//        System.out.println("You gave the number " +number);

// Taking a double input - but carefull you can't store double value in integer box(variable)

        System.out.println("Give a decimal number:");
        double number = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + number);
        

    }
}
