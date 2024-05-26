//ITESS
//25 de mayo de 2025
//Patricio Arturo Mendez Gonzalez
//POO
//Herencia y polimorfismo

package Unidad4_Practica3;


public class Practica3_Privado extends Practica3_Vehiculo {
    
    public String dueño;
    public int capacidad;

    public Practica3_Privado(String dueño, int capacidad, String marca, String modelo) {
        super(marca, modelo);
        this.dueño = dueño;
        this.capacidad = capacidad;
    }

    public String llevarCosas(){
        return dueño + " usa su vehiculo para cargar cosas";
    }
    
    public String llevarGente(){
        return dueño + " puede subir hasta " + capacidad + " personas en su vehiculo";
    }
    
    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Practica3_Privado{" + "due\u00f1o=" + dueño + ", capacidad=" + capacidad + '}';
    }
    
    
    
}
