package OOPprinciples3;

public class Polymorphism extends Encapsulation {

    double total(double a, double b){
        return a*b;
    }

    double total(double a, double b, double c){
        double x = a*b;


        return (x-(x*(c/100)));
    }
}
