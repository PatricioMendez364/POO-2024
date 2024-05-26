//ITESS
//25 de mayo de 2025
//Patricio Arturo Mendez Gonzalez
//POO
//Herencia y polimorfismo

package Unidad4_Practica3;


public class Practica3_Camioneta extends Practica3_Privado {
    
    public String cuatroporcuatro;
    String cabina;

    public Practica3_Camioneta(String cuatroporcuatro, String cabina, String dueño, int capacidad, String marca, String modelo) {
        super(dueño, capacidad, marca, modelo);
        this.cuatroporcuatro = cuatroporcuatro;
        this.cabina = cabina;
    }
    
    String cargarMercancia(){
        return dueño + " usa su camioneta para cargar mercancias";
    }
    
    String pasear(){
        return dueño + "usa su camioneta de cabina " + cabina + " para pasear";
    }

    public String isCuatroporcuatro() {
        return cuatroporcuatro;
    }

    public void setCuatroporcuatro(String cuatroporcuatro) {
        this.cuatroporcuatro = cuatroporcuatro;
    }

    public String getCabina() {
        return cabina;
    }

    public void setCabina(String cabina) {
        this.cabina = cabina;
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
        return "Practica3_Camioneta{" + "cuatroporcuatro=" + cuatroporcuatro + ", cabina=" + cabina + '}';
    }
    
    
    
}
