import java.util.Scanner;

public class EqualsTo3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input first number");
        int nr1 = scan.nextInt();
        System.out.println("Input second number");
        int nr2 = scan.nextInt();
        System.out.println("Input third number");
        int nr3 = scan.nextInt();

        if (nr1 == nr2 && nr2 == nr3){
            System.out.println("All numbers are equal");
        }else if (nr1 != nr2 && nr2 != nr3 & nr1 != nr3 ){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither different, neither equal");
        }
    }

}
