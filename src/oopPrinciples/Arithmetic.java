package oopPrinciples;

public class Arithmetic extends FirstClass {
    public static void main(String[] args) {


        Arithmetic calc = new Arithmetic();
        calc.setA(10);
        calc.setA(20);

        int addition = calc.getA() + calc.getB();
        int division = calc.getA() / calc.getB();
        int product = calc.getA() * calc.getB();
        int difference = calc.getA() - calc.getB();

        System.out.println(calc.getA());
        System.out.println(calc.getB());
        System.out.println(addition);
        System.out.println(division);
        System.out.println(product);
        System.out.println(difference);
    }
}
