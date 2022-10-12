package ejercicio4;

public class ClienteAscensor {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        UsuarioQueSube usuario1 = new UsuarioQueSube(8,ascensor);
        UsuarioQueBaja usuario2 = new UsuarioQueBaja(4,ascensor);
        UsuarioQueSube usuario3 = new UsuarioQueSube(10,ascensor);
        
        usuario1.start();
        usuario2.start();
        usuario3.start();
    }
}
