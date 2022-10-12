package ejercicio4;

public class Ascensor {
    
    
    int pisoActual = 0;
    final int pisoMaximo = 10;
    boolean estaSubiendo = false;
    boolean estaBajando = false;

    public Ascensor() {
    }

    public synchronized void subir(int pisos) {

        while (estaBajando == true) {
            try {
                wait();
            } catch (InterruptedException e) {
            }

        }
        estaBajando = false;
        estaSubiendo = true;
        for (int i = 1; i <= pisos; i++) {
            if (pisoActual == pisoMaximo) {
                System.out.println("Imposible subir mas allá");
                break;
            } else {
                pisoActual++;
                System.out.println("Esta subiendo, piso: "+pisoActual);
            }
        }
        System.out.println("Viaje completado, piso actual: " + pisoActual);
         estaSubiendo=false;
    }

    public synchronized void bajar(int pisos) {

        while (estaSubiendo == true) {
            try {
                wait();
            } catch (InterruptedException e) {
            }

        }
        estaBajando = true;
        estaSubiendo = false;
        for (int i = 1; i <= pisos; i++) {
            if (pisoActual == 0) {
                System.out.println("Imposible bajar, piso actual= " + pisoActual);
                break;
            } else {
                pisoActual--;
                System.out.println("Esta bajando, piso: "+pisoActual);
            }
        }
        System.out.println("Viaje completado, piso actual: " + pisoActual);
        
        estaBajando=false;
    }

}
