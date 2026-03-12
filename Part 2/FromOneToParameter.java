// Importing the input 
import java.util.Scanner;
public class FromOneToParameter {
    
    public static void main(String[] args) {
        printUntilNumber(2);
    }
    // creating the my own method 
    public static void printUntilNumber(int number){ // wait what is int number? I assigned the variable called number type int in paremater of my method 
       // here i chose i = 1 because compiler first print the i value 1 then it again check does i 
       // greater then number it is not then it will increse the i by 1 means now i will be 2 after that it again 
       // enter in the loop then print the i value again now it will be 2 so according to this steep it 
       // will go so on until the i is not greeter then or equel to number if i chose 0 then it would be start form 0 but question 
       // tells us it must be start from 1 
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}
