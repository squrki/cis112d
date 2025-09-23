import java.util.Scanner;

public class Lab14 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num = scnr.nextInt();
        String roman = new String();
        // int place = 1;
        while (num > 0) {
            System.out.print(num % 2);
            num /= 2;
            // System.out.printf("num: %d, place: %d\n", num, place);
            // // if place goes into num add to string
            // // subtrace place from num
            // // iterate again
            // // if ( num / place > 1) {
            // // continue;
            // // }

            // // switch (place) {
            // // case 1:
            // if (num % 2 == 1) {
            // roman += "1";
            // num -= 1;
            // } else {
            // roman += "0";
            // }
            // if (num / place == 1) {
            // roman += "1";
            // num -= place;
            // } else {

            // roman += "0";
            // }
            // place *= 2;
            // break;

            // // place *= 2;
            // // break;
            // // case 2:
            // // if (num / 2 == 1) {
            // // roman += "1";
            // // num -= 2;
            // // } else {
            // // roman += "0";
            // // }
            // // place *= 2;
            // // break;
            // // default:
            // // if (num / place == 1) {
            // // roman += "1";
            // // num -= place;
            // // } else {
            // // roman += "0";
            // // }
            // // place *= 2;
            // // break;
            // // }
            // // num -= place;
            // // if (place > 2) {
            // // place *= 2;
            // // }
            // System.out.printf("roman: %s\n", roman);
        }
        scnr.close();
        System.out.println(roman);
    }
}