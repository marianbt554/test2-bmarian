package OOPprinciples3;

public class Encapsulation {

    private double massKG;
    final private double price = 100.0;
    final private double discount = 30.0;

    public double getDiscount() {
        return discount;
    }

    public double getMassKG() {
        return massKG;
    }

    public double getPrice() {
        return price;
    }

    public void setMassKG(double massKG) {
        this.massKG = massKG;
    }



}
