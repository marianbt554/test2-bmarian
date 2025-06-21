package pufuleti;

public class Fabrica  {

    public Pufuleti produceCristinel(){

        System.out.println("Producing Cristinel");
        return new Pufuleti("Cristinel");
    }

    public Pufuleti produceCristinuta(){

        System.out.println("Producing Cristinuta");
        return new Pufuleti("Cristinuta");
    }
}
