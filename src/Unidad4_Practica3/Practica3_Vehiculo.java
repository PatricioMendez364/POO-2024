//ITESS
//25 de mayo de 2025
//Patricio Arturo Mendez Gonzalez
//POO
//Herencia y polimorfismo

package Unidad4_Practica3;


public class Practica3_Vehiculo {
    
    public String marca;
    public String modelo;

    public Practica3_Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String acelerar(){
        return "El vehiculo " + marca + " esta acelerando";
    }
    
    public String frenar(){
        return "El vehiculo " + marca + " esta frenando";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Practica3_Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }    
}
