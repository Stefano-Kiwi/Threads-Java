package com.mycompany.ejercitacion.multihilos;

public class RecursoCompartido {
    int contador = 0;

    public RecursoCompartido(){
        
    }
    
    public synchronized void Sumar(Hilo h) {
            contador++;
            System.out.println("Soy hilo "+h.getHilo()+" "+"Variable: "+contador);
    }
    
}
