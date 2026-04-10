
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a scaner 

        ArrayList<String> list = new ArrayList<>(); // created a arraylsit 
        while (true) { // loops always open 
            String input = scanner.nextLine(); // took the input 
            if (input.equals("")) { // condition input == 0 then break;
                break;
            }

            list.add(input); // otherwise add user response in arraylist
            
        }
       System.out.println(list.get(list.size() -1)); // i stored - aman, roshan, setish | i have three valuse but a/c to the indexing i have 0,1,2 | i want the last value means setish, | i wrote list.size() = 3 | and  - 1 
       // 3 -1 = 2 and 2 goes to list.get(2) because get only count indexing | and thats why i use -1 if i didn't use it then it would be list.get(3), which is not posible like 
       // aman, roshan, jatin = 0,1,2 there is no 3 indexing so focus of indexing while access the value of array
    }
}
