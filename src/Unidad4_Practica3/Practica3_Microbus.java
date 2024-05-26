//ITESS
//25 de mayo de 2025
//Patricio Arturo Mendez Gonzalez
//POO
//Herencia y polimorfismo

package Unidad4_Practica3;


public class Practica3_Microbus extends Practica3_Publico {
    
    String ruta;
    double costo;

    public Practica3_Microbus(String ruta, double costo, String tipoderuta, String iniciodejornada, String marca, String modelo) {
        super(tipoderuta, iniciodejornada, marca, modelo);
        this.ruta = ruta;
        this.costo = costo;
    }
    
    public String darlaParada(){
        return "El chofer se para para bajar pasaje";
    }
    
    public String completarRuta(){
        return "La ruta " + ruta + " es completada";
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String getTipoderuta() {
        return tipoderuta;
    }

    @Override
    public void setTipoderuta(String tipoderuta) {
        this.tipoderuta = tipoderuta;
    }

    @Override
    public String getIniciodejornada() {
        return iniciodejornada;
    }

    @Override
    public void setIniciodejornada(String iniciodejornada) {
        this.iniciodejornada = iniciodejornada;
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
        return "Practica3_Microbus{" + "ruta=" + ruta + ", costo=" + costo + '}';
    }
    
    
    
}
