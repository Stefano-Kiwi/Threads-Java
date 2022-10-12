package ejercicio2;

public class HiloPares extends Thread{

    public HiloPares() {
    }
    
    @Override
    public void run(){
        int suma = 0;
        try{
        for(int i=0;i<=10;i++){
            sleep((int)(Math.random()*1000));
            if(i%2==0){
                System.out.println("i: "+i);
                suma = suma + i;
            }
        }
        System.out.println("La suma es: "+suma);
        }catch(InterruptedException e){}
    }
}