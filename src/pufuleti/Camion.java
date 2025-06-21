package pufuleti;

public class Camion extends Fabrica{

    public void transport(){
        System.out.println("Transportam pufuleti");
    }

    Camion camion = new Camion();

    String transportObj = camion.getCristinel();
    String transportObj2 = camion.getCristinuta();


}
