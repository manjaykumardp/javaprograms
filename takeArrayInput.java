import java.util.ArrayList;
import java.util.Scanner;

public class takeArrayInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        {
            for (int i = 0; i < arr.length; i++)
                arr[i] = sc.nextInt();
            {
                System.out.println("Elements of original array: ");
            }

            {
                for(int j:arr)
                    System.out.print(j+ " ");

            }
            System.out.println("\n");
        }
    }
}

