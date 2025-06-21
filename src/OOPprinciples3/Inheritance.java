package OOPprinciples3;
import java.util.Scanner;

public class Inheritance extends Polymorphism {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Inheritance executor = new Inheritance();
        double total;
        System.out.println("Input desired quantity(kg): ");
        double m = scan.nextDouble();
        executor.setMassKG(m);
        double mass = executor.getMassKG();

        double price = executor.getPrice();
        double discount = executor.getDiscount();

        System.out.println("Price for this product is " + price);
        System.out.println("Do you have a discount? (yes/no)");
        String answer = scan.next();

        if( answer.equalsIgnoreCase("yes")){
            total = executor.total(mass, price, discount);
        }else{
            total = executor.total(mass, price);
        }

        System.out.println("Total price = " + total + "$");
    }

}
