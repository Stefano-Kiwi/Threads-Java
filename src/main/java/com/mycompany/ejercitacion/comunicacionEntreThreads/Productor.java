package com.mycompany.ejercitacion.comunicacionEntreThreads;

public class Productor extends Thread{
    private Almacen almacen;
    private String alfabeto ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public Productor(Almacen a){
        almacen = a;
    }
    public void run(){
        char c;
        for(int i=0;i<10;i++){
            c=alfabeto.charAt((int)(Math.random()*26));
            almacen.Adicionar(c);
            
            System.out.println("Se adiciona "+c+" al almacen");
            try{
                sleep((int)(Math.random()*100));
            }catch(InterruptedException e){
                
                System.out.println("El error que se encontró en Productor fue: "+e);
                
            }
        }
    }
}
