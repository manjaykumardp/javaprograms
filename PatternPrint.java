
import java.util.Scanner;

public class PatternPrint {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.print("Enter Hollow Square with Diagonals Side = ");
        int side = sc.nextInt();

        System.out.println("Hollow Square Star with Diagonals Pattern");

        for (int i = 0; i <= side; i++ )
        {
            for (int j = 0 ; j <= side; j++ )
            {
                if (i == 0 || i == side || i == j ||
                        j == 0 || j == side || j == side - i||i==side/2 ||j==side/2||i==side/2-i
                ||j==side/2-j||i+j==side/2) {

                    System.out.print("* ");

                }
                else {
                    System.out.print("  ");
                }
            }
           // System.out.println(" ");
            System.out.println();
        }
    }
}