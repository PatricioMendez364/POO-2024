//ITESS
//25 de mayo de 2025
//Patricio Arturo Mendez Gonzalez
//POO
//Herencia y polimorfismo

package Unidad4_Practica3;


public class Practica3_Empleado extends Practica3_Persona {
    
    public String puesto;
    public double salario;

    public Practica3_Empleado(String puesto, double salario, String nombre, int edad) {
        super(nombre, edad);
        this.puesto = puesto;
        this.salario = salario;
    }
    
    public String trabajar(){
        return nombre + " se fue a trabajar";
    }
    
    public String cobrar(){
        return nombre + " cobra su salario de " + salario + " pesos";
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

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
    
    
    
}
