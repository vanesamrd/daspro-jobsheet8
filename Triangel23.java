import java.util.Scanner;

/**
 * Triangel23
 */
public class Triangel23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  i = 0;

        while (i < 5) {
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
