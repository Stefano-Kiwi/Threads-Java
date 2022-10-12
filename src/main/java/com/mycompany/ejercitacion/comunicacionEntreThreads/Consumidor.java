package com.mycompany.ejercitacion.comunicacionEntreThreads;

public class Consumidor extends Thread{
    private Almacen almacen;
    
    public Consumidor(Almacen a){
        almacen = a;
    }
    
    public void run(){
        char c;
        
        for(int i=0;i<10;i++){
            c = almacen.Sacar();
            
            System.out.println("Se saco "+c+" del almacen...");
            try{
                sleep((int)(Math.random()*1000));
            }catch(InterruptedException e){}
        }
    }
}
