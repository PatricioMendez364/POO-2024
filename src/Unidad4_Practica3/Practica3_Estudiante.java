//ITESS
//25 de mayo de 2025
//Patricio Arturo Mendez Gonzalez
//POO
//Herencia y polimorfismo

package Unidad4_Practica3;


public class Practica3_Estudiante extends Practica3_Persona {
    
    public String carrera;
    public String matricula;

    public Practica3_Estudiante(String carrera, String matricula, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.matricula = matricula;
    }
    
    public String estudiar(){
        return nombre + " de la carrera de " + carrera + " esta estudiando";
    }
    
    public String hacerTarea(){
        return nombre + " esta haciendo tarea";
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
        return "Practica3_Estudiante{" + "carrera=" + carrera + ", matricula=" + matricula + '}';
    }
    
    
    
    
}
