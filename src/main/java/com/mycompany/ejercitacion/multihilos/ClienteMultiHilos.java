package com.mycompany.ejercitacion.multihilos;

public class ClienteMultiHilos {
    public static void main(String[] args) {
        RecursoCompartido recursito = new RecursoCompartido();
        
        for(int i=0;i<Integer.parseInt(args[0]);i++){
            (new Hilo(String.valueOf(i),recursito)).start();
        }
    }
}
