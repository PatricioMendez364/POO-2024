//Patricio Arturo Mendez Gonzalez
//14 de abril de 2024
package Clases;


public class Alumno {
    
    private String nombre;
    private int edad;
    private String carrera;
    private String id;
    private double calificacion;
    
    public Alumno(){}

    public Alumno(String nombre, int edad, String carrera, String id, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.id = id;
        this.calificacion = calificacion;
    }
    
    public String estudiar(boolean estudiar){
        if(estudiar == true){
            return "Felicidades, pasaste el examen";
        } else {
            return "No pasaste :(";
        }
    }
    
    public String hacerTarea(boolean tarea){
        if(tarea == true){
            return "Bien hecho, terminaste tu tarea";
        } else {
            return "Tienes 0";
        }
    }
    
    public double sacarPromedio(double calif1, double calif2, double calif3){
        double promedio = (calif1 + calif2 + calif3)/3;
        return promedio;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + ", id=" + id + ", calificacion=" + calificacion + '}';
    }
        
    

}
