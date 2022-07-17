import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.lang.Math;

public class ArrayList2<arrayList> {

    public static void main(String[] args) {
        int i, j;
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
          for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i+j==n/2 || i+j==3*n/2 || i-j==2 || i-j==-2) {

                 /*   int value = Math.abs((n/2-j));
                     int value1 = Math.abs(i -value);

                  */
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}