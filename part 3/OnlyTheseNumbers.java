
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.println("from where?");
        int res1 = Integer.valueOf(scanner.nextLine());
        System.out.println("To where?");
        int res2 = Integer.valueOf(scanner.nextLine());
        edit(res1, res2, numbers);
       
    }
     public static void edit(int value1, int value2, ArrayList numbers) {
            for (int i = value1; i <= value2;i++ ) {
                System.out.println(numbers.get(i));
            }
        }
}
