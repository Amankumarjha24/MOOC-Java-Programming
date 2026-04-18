
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        /*
        so let's start the why i chose ? = 
        i created the open loop where i takes the user input and store it to list 
        
        second thing i created a smallest variable which stores the smallest value of list how lest me tell you
        for that i created a loop where loop goes until list size and loop start from the index i because i 
        i assign the smallest value from index 0 and in the loop it will compare if list at index 1 means second value of list
        is smaller then smallest value (yes i know i am not conform that the first value of loop is smallest but i assume that ) if 
        second value smaller then first value then if yes it means the smallest value is the second value of list 
        and after that i assign the second value of list in smallest (smallest = list.get(1))
        
        
        now from that i found the smallest value ok bbut but but it will only store the smallest no equele ok 
        means if your array contains two times a smallest value like 2 then it will only store 2 but main things is that we just want to say hello the value 2 is smallest but you can
        find it at the index of x and y (did you got up we don't need to print 2 two times just to represent the user that 2 wiil be present at which index)
        for that i created another loop which just store index of 2 wher ever 2 present in loop it will print that index value 
        
        second loop - it will start form 0 and goes < list.size() ok but the main thing is in the while loop
        if list.get(index) means start from 0 is equale to smallest (explanation - meaning hai list listen i will check your every value if some of the value 
        will be equele then to the my smallest value then i will run the if condition ) if condition run it will print the index of it where ever he found the smallest value 
        and the best thing is that if your 2 presnt at inedx 2 and index 5 it will print both of then because we doesent stop the loop 
        after just print once it will continue until the guard i reaches liss then list size -
        */
        while(true) {
            int userINput = Integer.valueOf(scanner.nextLine());
            if(userINput == 9999) {
                break;
            }
            list.add(userINput);
        }
        int smallest = list.get(0);
        for(int i =1; i < list.size(); i++) {
            if (list.get(i) < smallest){
                smallest = list.get(i);  
               
            }
            
        }
        System.out.println("Smallest number: " + smallest);
        
        for (int i = 0; i < list.size(); i++){
            if(list.get(i) == smallest) {
                System.out.print("Found at index: " + i);
            }
        }
         
        
    }
}
