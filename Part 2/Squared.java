
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // identiry the type of variable and take the user input according to it 
        int first = Integer.valueOf(scanner.nextLine());
        // after identiry the type of variable store that value with right operation 
        int square = first * first;
        // print the variable value in which operation are stor
        System.out.println(square);
        

    }
}
