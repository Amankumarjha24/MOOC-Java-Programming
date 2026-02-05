
import java.util.Scanner;

public class GiftTax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift ");
        double value = Double.valueOf(scan.nextLine());
        if (value >= 5000.0 && value <25000.0) {
            double texamt = 100;
            double txtrat = 8;
            double res = (texamt + (value - 5000.0) *(txtrat/100.0));
            System.out.println("Tax " + res);
        } else if (value >= 25000.0 && value < 55000.0) {
            double texamt = 1700;
            double txtrat = 10;
            double res = (texamt + (value - 25000.0) * (txtrat/100.0));
            System.out.println("Tax "+ res);
        } else if (value >= 55000.0 && value < 200000.0) {
            double texamt = 4700;
            double txtrat = 12;
            double res = (texamt + (value - 55000.0) * (txtrat/100.0));
            System.out.println("Tax " + res);
        } else if (value >=200000.0 && value <1000000.0) {
            double texamt = 22100;
            double txtrat = 15;
            double res = (texamt + (value - 200000.0) * (txtrat/100.0));
            System.out.println("Tax " + res);
        } else if (value >= 1000000.0) {
            double texamt = 142100;
            double txtrat = 17;
            double res = (texamt + (value - 1000000.0) * (txtrat/100.0));
            System.out.println("Tax " + res);
        } else {
            System.out.println("No tax!");
        }
    }
}
