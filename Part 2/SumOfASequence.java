
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // a program which calsulate the sum 1+2+3... +n where n is given as user input
        System.out.println("Last number? ");
        int userInput = Integer.valueOf(scanner.nextLine());
//        int count = 0;
//        int sum = 0;
//        while (true) {
//            sum = count + (sum + 1);
//            count++;
//            
//            if (count >= userInput){
//                break;
//            }
//        }
//        System.out.println("The sum is " + sum);

        int i = 1;
        int sum = 0;
        while (true) {
            sum = sum + i;
            i++;
            
            if (i >= userInput){
                break;
            }
        }
        System.out.println("The sum is " + sum);
        
    }
}
