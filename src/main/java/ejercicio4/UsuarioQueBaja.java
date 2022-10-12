package ejercicio4;

public class UsuarioQueBaja extends Thread {

    private Ascensor ascensor;
    private int pisos;

    public UsuarioQueBaja(int pisos, Ascensor ascensor) {
        this.pisos = pisos;
        this.ascensor = ascensor;
    }

    @Override
    public void run() {
        //System.out.println("Piso actual: "+ascensor.pisoActual);
        ascensor.bajar(this.pisos);
    }
}
