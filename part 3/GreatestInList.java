

import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(); // created a array to store array
        System.out.println("Please enter the array"); // just a print tag for asking whit user
        while (true) {  // loop always open
            int input = Integer.valueOf(scanner.nextLine()); // created a input variable and assign user response to it first respnse 
            if (input == -1) { // after the first respnse it check does user input is -1 if yess break the loo
                break;
            }

            list.add(input); // if not then add the first respnse in to the arraylist and agar start the loop
        }
        
        

        // implement finding the greatest number in the list here
        int greatest = list.get(0); // created a greatest loop here it will start for array index 0 means first value of array
        for(int i = 0; i < list.size(); i++) { 
            // loop it will work until the size of i is less then the array 
            int number = list.get(i); // created the number variable which store the list value one by one i = 0,1,2,3,4 etc
            if (greatest < number) { // after one value comes it check doest greatest value means first value of array list is 
               // less then the number here number is array first number 
               // and guess what we are asking if first number is 72 then we are askng 
               // does 72 is greatest then 72 then it false after it assign the number 72 to
               // greatest again which means greatest still ramain 72 but now that time 
               // loop - i is 1 then means if 1 position value is 2 then it check like that 
               // number is list.get(1) is 2 then greatest < number = 72 < less then 2 false then greatest is number 
               // still remain 72 becasue if conditon doest run it doesnt run until the value of 
               // number is greater then greates if it is then it will run and assign the gritest value to it
               // 
               
               //!!!! note - when i = 0 starts computer need to do reptetive task like if first value gretest and number = 72 
               // then what the matter to start checking with first - find the solution !!!
                greatest = number;
            }
        }
        System.out.println("The greatest number: " + greatest);
        
    }
}
