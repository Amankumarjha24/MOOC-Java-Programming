
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
//        System.out.println("Where to?");
//        int number = Integer.valueOf(scanner.nextLine());
//        
//        int i = 1;
//        while(true) {
//            if (i <=number){
//                System.out.println(i);
//                i++;
//                
//            } else {
//                break;
//            }
//        
//            
//           
//        }
        System.out.println("Where to?");
        int input1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int input2 = Integer.valueOf(scanner.nextLine());
        int x = input2;
        while(true){
            if (x <= input1){
                System.out.println(x);
                x++;
            } else  {
                break;
            }
        }
       
    }
}
