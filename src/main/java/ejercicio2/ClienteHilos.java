package ejercicio2;

public class ClienteHilos {
    public static void main(String[] args) {
        HiloImpares hiloImpares = new HiloImpares();
        HiloPares hiloPares = new HiloPares();
        hiloImpares.start();
        hiloPares.start();
    }
}
