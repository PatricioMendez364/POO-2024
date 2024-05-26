//ITESS
//25 de mayo de 2025
//Patricio Arturo Mendez Gonzalez
//POO
//Herencia y polimorfismo

package Unidad4_Practica3;


public class Practica3_Motocicleta extends Practica3_Privado {
    
    public String cambios;
    public String tipodemoto;

    public Practica3_Motocicleta(String cambios, String tipodemoto, String dueño, int capacidad, String marca, String modelo) {
        super(dueño, capacidad, marca, modelo);
        this.cambios = cambios;
        this.tipodemoto = tipodemoto;
    }

    public String hacerCaballito(){
        return dueño + " usa su moto " + tipodemoto + " para hacer una caballito";
    }
    
    public String rebasarAutos(){
        return dueño + " usa su moto " + tipodemoto + " para pasar entre los autos";
    }
    
    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }

    public String getTipodemoto() {
        return tipodemoto;
    }

    public void setTipodemoto(String tipodemoto) {
        this.tipodemoto = tipodemoto;
    }

    @Override
    public String getDueño() {
        return dueño;
    }

    @Override
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    @Override
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
        return "Practica3_Motocicleta{" + "cambios=" + cambios + ", tipodemoto=" + tipodemoto + '}';
    }
    
    
    
}
