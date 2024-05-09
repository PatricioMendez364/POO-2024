//9 de mayo de 2024
//Clase creada para la clase "Lista10Alumnos".
package Unidad3;


public class ClaseAlumno {
    
    private String nombre;
    private double calif;

    public ClaseAlumno(String nombre, double calif) {
        this.nombre = nombre;
        this.calif = calif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalif() {
        return calif;
    }

    public void setCalif(double calif) {
        this.calif = calif;
    }

    @Override
    public String toString() {
        return "ClaseAlumno{" + "nombre=" + nombre + ", calif=" + calif + '}';
    }
    
}
    

