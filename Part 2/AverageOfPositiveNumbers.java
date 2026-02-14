
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 0;
        double sum = 0;
        while (true) {
            double input = Double.valueOf(scanner.nextLine());
            if (input == 0){
                System.out.println("Cannot calculate the average");
                break;
            }
            if (input > 0) {
                count = count +1;
                sum = sum + input;
            } 
                
           
        }
        double avg = sum / count;
        System.out.println(avg);
    }
}
