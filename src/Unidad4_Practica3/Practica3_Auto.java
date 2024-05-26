//ITESS
//25 de mayo de 2025
//Patricio Arturo Mendez Gonzalez
//POO
//Herencia y polimorfismo

package Unidad4_Practica3;


public class Practica3_Auto extends Practica3_Privado {
    
    public String color;
    public String cambios;

    public Practica3_Auto(String color, String cambios, String dueño, int capacidad, String marca, String modelo) {
        super(dueño, capacidad, marca, modelo);
        this.color = color;
        this.cambios = cambios;
    }
    
    public String iralaEscuela(){
        return dueño + " lleva a sus hijos a la escueña";
    }
    
    public String iralMandado(){
        return dueño + " compra el mandado";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }

    @Override
    public String getDueño() {
        return dueño;
    }

    @Override
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
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
        return "Practica3_Auto{" + "color=" + color + ", cambios=" + cambios + '}';
    }
    
    
}
