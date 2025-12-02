import java.util.Scanner;

public class DigitCounter {

    /* TODO: Write recursive digitCount() method here. */
    public static int digitCount(int num) {
        int digits = 1;

        if (num / 10 > 0) {
            num /= 10;
            digits += digitCount(num);
        } else
            return 1;
        return digits;

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num, digits;

        num = scnr.nextInt();
        digits = digitCount(num);
        System.out.println(digits);
    }
}
