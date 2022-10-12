package com.mycompany.ejercitacion.comunicacionEntreThreads;

public class TesteoProductorConsumidor {
    public static void main(String[] args) {
        Almacen a = new Almacen();
        Productor p = new Productor(a);
        Consumidor c=new Consumidor(a);
        
        p.start();
        c.start();
        try{
            p.join();
            c.join();
            
        }catch(InterruptedException e){
            System.out.println("Interrupcion del usuario");
        }
    }
}
