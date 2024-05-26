//ITESS
//25 de mayo de 2025
//Patricio Arturo Mendez Gonzalez
//POO
//Herencia y polimorfismo

package Unidad4_Practica3;


public class Practica3_Persona {
    
    public String nombre;
    public int edad;

    public Practica3_Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String comer(){
        return nombre + " esta comiendo";
    }
    
    public String dormir(){
        return nombre + " se fue a dormir";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Practica3_Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
