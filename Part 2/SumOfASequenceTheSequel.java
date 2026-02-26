
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int input1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int input2 = Integer.valueOf(scanner.next());
        int check = input1;
        int sum = 0;
        
        while (true){
            sum = sum + check;
            check++;
            
            if (check > input2) {
                break;
            }
        }
        System.out.println("The sum is" + sum);
    }
}
