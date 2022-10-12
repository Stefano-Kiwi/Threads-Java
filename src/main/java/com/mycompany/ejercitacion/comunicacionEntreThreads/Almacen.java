package com.mycompany.ejercitacion.comunicacionEntreThreads;

public class Almacen {
    private char buffer[]=new char[6];
    private int proximo=0;
    private boolean estaLleno=false;
    private boolean estaVacio=true;
    
    public synchronized char Sacar(){
        while(estaVacio==true){
            try{
                wait();
            }catch(InterruptedException e){}
                
            }
        proximo--;
        if(proximo==0){
            estaVacio=true;
        }
        estaLleno=false;
        notify();
        return(buffer[proximo]);
        }
    
    public synchronized void Adicionar(char c){
        while(estaLleno==true){
            try{
                wait();
            }catch(InterruptedException e){}
        }
        buffer[proximo]=c;
        proximo++;
        if(proximo==buffer.length){
            estaLleno=true;
        }
        estaVacio=false;
        notify();
    }
    }
