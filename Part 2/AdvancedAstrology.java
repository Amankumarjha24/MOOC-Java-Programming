
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int check = 1;
        while (check <= number) {
            System.out.print("*");
            check++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int check =1;
        while (check <= number) {
            System.out.print(" ");
            check++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int check =1;
        while (check <= size) {
            printSpaces(size-check);
            printStars(check);
            check++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int check = 1;
        int i = 1;
        while (check <= height) {
            printSpaces(height - check);
            printStars((check * 2)-1);
            check++;
                
        }
        while (i <= 2) {
            printSpaces(height-2);
            printStars(3);
            i++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
