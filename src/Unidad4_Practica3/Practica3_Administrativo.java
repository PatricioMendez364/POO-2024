//ITESS
//25 de mayo de 2025
//Patricio Arturo Mendez Gonzalez
//POO
//Herencia y polimorfismo

package Unidad4_Practica3;


public class Practica3_Administrativo extends Practica3_Empleado {
    
    public String empresa;
    public String titulo;

    public Practica3_Administrativo(String empresa, String titulo, String puesto, double salario, String nombre, int edad) {
        super(puesto, salario, nombre, edad);
        this.empresa = empresa;
        this.titulo = titulo;
    }
    
    public String administrar(){
        return "El " + titulo + "esta administrando los documentos de la empresa " + empresa;
    }
    
    public String hacerPapeleo(){
        return "El " + titulo + "esta organizando su papeleo";
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

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
        return "Practica3_Administrativo{" + "empresa=" + empresa + ", titulo=" + titulo + '}';
    }
    
    
    
}
