import java.util.Scanner;

public class lab14 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num = scnr.nextInt();
        System.out.println(num);
        String roman = new String();
        int place = 1;
        while (num > 0) {
            System.out.println(num);
            switch (num) {
                case 0:
                    roman += "0";
                case 1:
                    roman += "1";
            }
            num -= place;
            place *= 2;
        }

        scnr.close();
        System.out.println(roman);
    }
}
