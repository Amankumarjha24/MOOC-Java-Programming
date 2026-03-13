
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2,10);
    }
    public static void divisibleByThreeInRange(int beginning, int end) {
        for(int i = beginning; i <= end; i++) {
            if(i%3 == 0){
                System.out.println(i);
                
            }

        }
    }
}


/*
===========What is did here============

1. Created a method and assign two variable in it's peremater 
2. logic - question said that you have to create that method where user put to values
start and end and you have to print those values form that range whose is devesible by 3 

3. What i did - first create a i variable in for lop and assignt it beginning because 
i must be equele to beginning value becasue renge should be start form beginning value
seocnd i use conditon if i value less then or = to  end then loop should be run after thet i++

4. another condition for working -if i%3 = 0 it is a guard it check all the i = 2,3,4,5,6,7,8,9,10
like first for 2 - if 2%3 ==0 ? Not then it can't enter second - if 3%3 == 0 ? yes now it can enter 
and now it enter enter into condition because it work and then find the print function 
in that funciotn it print the i value which is 3 in the conditon after then i value would be 4 then recheck 4 is not devesible 
to premession then go ahead i++ = 5 no premessio go ahead i++ = 6 premession now print 3,6 so on
*/