
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // identify the value and take it fromo user and store it in variable 
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        int add = first + second;
        double squareRoot = Math.sqrt(add);
        if (first <= 0 && second <= 0 ) {
            System.out.println("Not right value");
        } else {
            System.out.println(squareRoot);
        }
    }
}
