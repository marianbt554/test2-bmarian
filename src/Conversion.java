import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input a number of byte type");
        byte nrByte = scan.nextByte();
        System.out.println("Conversion in progress...");
        short nrShort = nrByte;
        System.out.println("Your byte value: " + nrByte);
        System.out.println("Your short value: " + nrShort);


        System.out.println("Input a number of int type");
        int nrInt = scan.nextInt();
        double nrDouble = nrInt;
        System.out.println("Conversion in porgress...");
        System.out.println("Your int value: " + nrInt);
        System.out.println("Your double value: " + nrDouble);

        System.out.println("Input long value");
        long nrLong = scan.nextLong();
        int nrInt1 = (int)nrLong;
        System.out.println("Conversion in progress");
        System.out.println("Your long value: " + nrLong);
        System.out.println("Your int value: " + nrInt1);
    }


}
