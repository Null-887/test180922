import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static double s_pow(double a, int power) {
        if (power == 0) {
            return 1;
        }  else if (power % 2 == 0) {
            return s_pow(a * a, power / 2);
        } else {
            return a * s_pow(a, power - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        int n = in.nextInt();
        System.out.println(s_pow(a, n));
    }
}