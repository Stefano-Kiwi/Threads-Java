package ejercicio4;

public class UsuarioQueSube extends Thread {

    private Ascensor ascensor;
    private int pisos;

    public UsuarioQueSube(int pisos, Ascensor ascensor) {
        this.pisos = pisos;
        this.ascensor = ascensor;
    }

    @Override
    public void run() {
        //System.out.println("Piso actual: "+ascensor.pisoActual);
        ascensor.subir(this.pisos);
    }
}
