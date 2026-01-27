
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
//            System.out.println("How many days would you like to convert to seconds?");
//            
//            int day = Integer.valueOf(scanner.nextLine());
//           
//           int second = day *24 *60*60;
//           System.out.println(second);

//      Find second in a day 
System.out.println("How many days would you like to convert to seconds?");
int day = Integer.valueOf(scanner.nextLine());
int second = day * 24*60*60;
        System.out.println("Your ans is :" + second);
//        
//        1 day = 24 hours 
//        n days = hours ? 
//                if 1 day is 24 hours 
//                        then if 2 days how many hours simple 2 *24
//                        so we have to first convert the day into hours then 
//                                
//                                24 hours = minut?
//                                        1 hour = 60 minutes
//                                                n hours = minuts ?
//                                                        n hours = n * 60
//                                                        now the we have minut :
//                                                        total minut * 60 second = total second 
//                                                                because 1 min always has 60 second
    }
}
