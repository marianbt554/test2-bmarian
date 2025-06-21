package pufuleti;

public class RunTest {

    public static void main(String[] args) {
        Fabrica factory = new Fabrica();
        Pufuleti cristinel = factory.produceCristinel();
        Pufuleti cristinuta = factory.produceCristinuta();

        Camion camion = new Camion();

        Chisinau city = new Chisinau();

        camion.transport(cristinel, city.getMetro());
        camion.transport(cristinuta, city.getMetro());

        camion.transport(cristinel, city.getNr1());
        camion.transport(cristinuta, city.getNr1());

        camion.transport(cristinel, city.getLinella());
        camion.transport(cristinuta, city.getLinella());

    }
}
