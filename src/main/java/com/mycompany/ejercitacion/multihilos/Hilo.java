package com.mycompany.ejercitacion.multihilos;

public class Hilo extends Thread implements Runnable{
    String nombre;
    RecursoCompartido recurso;

    public Hilo(String nombre, RecursoCompartido recurso) {
        this.nombre = nombre;
        this.recurso = recurso;
    }
    
    @Override
    public void run(){
        for (int x=0;x<=20;x++){
            recurso.Sumar(this);
        }
    }
    
    public String getHilo(){
        return nombre;
    }
}
