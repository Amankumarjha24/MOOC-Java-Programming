
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        //Take the user input because the factorial value depend on the user input 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int checker = 1;  // Why checker = 1, because
        /*
        *Because question is - Implement a program which calculates the factorial of a number given by the user.

Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n. For example, the factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24. Additionally, it has been specified that the factorial of 0 is 1, so 0! = 1.
        and according to it if a assign checker 0 then it will be factoral = checker * factrioal = 0 * factroial = 0
        why? factorial assigned 1 ----- because the factroial is started form the 1 not 0 suppose user give valeu 3 ok 
        then factroial should be 1*2*3 = 6 not 0*1*2*3 = 0 ans that's why i assieng the frectroial value 1;
        
        
        while function = condition if checker means count value less then or equal to user value (3) then brake the looop
        factroial = checker * factorial; means 1 * 1 = 1 ok but but but after that checker++ is still there what it do?
        it increases the value of checker by 1 wile loop are moving and becausee of that the factroial value is going up
        like first 1*1 = 1; second 2*1 = 2; after that 3*2 = 6; boom ops 3 means checker value is 3 now loop hase to be stoped
        */
        int factorial = 1;
        
        
        while (checker <= number ){
            factorial = checker * factorial;
            checker++;
        }
        System.out.println("Factorial: " + factorial);
    }
       
}
