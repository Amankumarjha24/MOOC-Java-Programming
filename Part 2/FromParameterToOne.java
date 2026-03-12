

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }
    public static void printFromNumberToOne(int number) {
        for (int i = number; i > 0; i--){
            System.out.println(i);
        }
    }
}
/*
what i do 
first - i assign "i" value to number value becasue according to aquestion starting number
should be start for the method peremeter number and second thing is that i use "i" must be 
less then 0 Why ? because if i would not use this then it will go infnitely // it
stops the loop when "i" value comes to less then 0 or = 0 
second thing is that i use "i" decrement (--) the reason is that question tells me that 
it should be go down like 5,4,3,2,1
*/