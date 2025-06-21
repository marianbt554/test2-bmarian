import java.util.Scanner;

public class NegativeTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input a number");
        int number = in.nextInt();
        if (number < 0 ){
            System.out.println("Number is negative");
        }else {
            System.out.println("Number is positive");
        }

    }

}
