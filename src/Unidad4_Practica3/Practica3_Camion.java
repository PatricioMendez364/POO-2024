//ITESS
//25 de mayo de 2025
//Patricio Arturo Mendez Gonzalez
//POO
//Herencia y polimorfismo

package Unidad4_Practica3;


public class Practica3_Camion extends Practica3_Publico {
    
    String destino;
    String linea;

    public Practica3_Camion(String destino, String linea, String tipoderuta, String iniciodejornada, String marca, String modelo) {
        super(tipoderuta, iniciodejornada, marca, modelo);
        this.destino = destino;
        this.linea = linea;
    }
    
    public String recogerBoletos(){
        return "El chofer recoge los boletos de los pasajeros";
    }
    
    public String viajar(){
        return "El camion de la linea " + linea + " sale con destino a " + destino;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
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
        return "Practica3_Camion{" + "destino=" + destino + ", linea=" + linea + '}';
    }
    
    
    
}
