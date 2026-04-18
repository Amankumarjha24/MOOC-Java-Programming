
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        // implement here finding the indices of a number
        
        /*
        ==info time - what i did here lst's understand this list.add(input) uses to add useer
        input to array right? -
        but lest understand what i did - first i print the question which usefull for user to understand 
        what the computer want second i take the response of user in search | after that main task had been done 
        i created the loop where i use "i" for the indexing number means i will be use at the plase of index
        i < list.size() meanss loop will be run until the i value is not < list size | 
        till these are common but the main fact in the if conditon - i wrote if list means array
        value == user search then that is the what user want to see ok but the main fact is that
        i use here list.get(i) wihch means i value here | for first run of loop it will be 0 means 0 indexing and 1 value of array
        if 1 value of array are not == to user search then loop will be run again now this time i value will be 1 because i++ 
        i value 1 means array second value then again it will check it if true print the user ans 
        
        Error 0 please dont use braek; if your array have same two value suppose that 10 ok we have 10 in our array
        for 3 times then if i wrote this if list.get(index) == 10 if it is true then condition will run 
        but if your condition contain break; it will only print the first 10 but what about the others that's why we dont should to use break; if we
        use it computer will stop when it's found the first value 
        */
        System.out.println("Search for?");
        int search = Integer.valueOf(scanner.nextLine());
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i) == search) {
                System.out.println(search + " is at index " + i);
                
            }
        }
    }
}
