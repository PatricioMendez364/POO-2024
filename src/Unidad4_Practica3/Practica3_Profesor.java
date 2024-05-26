//ITESS
//25 de mayo de 2025
//Patricio Arturo Mendez Gonzalez
//POO
//Herencia y polimorfismo

package Unidad4_Practica3;


public class Practica3_Profesor extends Practica3_Empleado {
    
    public String escuela;
    public String clase;

    public Practica3_Profesor(String escuela, String clase, String puesto, double salario, String nombre, int edad) {
        super(puesto, salario, nombre, edad);
        this.escuela = escuela;
        this.clase = clase;
    }
    
    public String darClase(){
        return "El profesor " + nombre + " da la clase de " + clase;
    }
    
    public String calificar(){
        return "El profesor " + nombre + " califica a los alumnos de la escuela " + escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public String getPuesto() {
        return puesto;
    }

    @Override
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Practica3_Profesor{" + "escuela=" + escuela + ", clase=" + clase + '}';
    }
    
    
}
