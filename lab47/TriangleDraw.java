import java.util.Scanner;

public class TriangleDraw {

    /* TODO: Write recursive drawTriangle() method here. */
    // Write a recursive method called drawTriangle() that outputs lines of '*' to
    // form a right side up isosceles triangle. Method drawTriangle() has one
    // parameter, an integer representing the base length of the triangle. Assume
    // the base length is always odd and less than 20. Output 9 spaces before the
    // first '*' on the first line for correct formatting.

    public static void drawTriangle(int baseLength) {
        if (baseLength == 0) {
            return;
        }
        if (baseLength > 1)
            drawTriangle(baseLength - 2);

        for (int i = 0; i < (19 - baseLength) / 2; i++)
            System.out.print(" ");
        for (int i = 0; i < baseLength; i++)
            System.out.print("*");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int baseLength;

        baseLength = scnr.nextInt();
        drawTriangle(baseLength);
    }
}
