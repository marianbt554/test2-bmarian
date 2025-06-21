import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How big do you want your array to be?");
        int n = scan.nextInt();
        int [] arr = new int[n];
        int sum = 0;
        for (int i = 0; i<n; i++){

            System.out.println("Input " + (i+1) + " integer array element");
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of all array elements is: " + sum);
    }
}
