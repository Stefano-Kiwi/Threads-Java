package ejercicio1;

public class ClienteCarrera {
    public static void main(String[] args) {
        Perro pepe = new Perro("Pepe",1);
        Perro juan = new Perro("Juan",3);
        Perro daniel = new Perro("Daniel",8);
        
        pepe.yield();
        juan.yield();
        daniel.yield();
        
        pepe.start();
        juan.start();
        daniel.start();
    }
}