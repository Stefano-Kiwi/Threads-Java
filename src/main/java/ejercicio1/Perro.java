package ejercicio1;

public class Perro extends Thread{
    
    @Override
    public void run(){
        for(int i=0;i<30;i++){
            System.out.println(nombre+" = "+i);
        }
        System.out.println("El perro "+nombre+" llegó a la meta");
    }
    
    private String nombre;

    public Perro(String nombre, int prioridad) {
        this.nombre = nombre;
        setPriority(prioridad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + '}';
    }
    
}
