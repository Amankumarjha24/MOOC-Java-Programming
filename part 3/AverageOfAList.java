
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        while (true) {
            
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1) {
                break;
            }
            list.add(input);
             
        }
        int sum = 0;
        double avg = 0;
       
        for(int i = 0; i < list.size(); i++) {
            int listsum = list.get(i);
            sum = sum + listsum;
            
        }
        avg = (double) sum / list.size();
        System.out.println(avg);
    }
}
