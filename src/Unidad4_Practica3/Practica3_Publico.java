//ITESS
//25 de mayo de 2025
//Patricio Arturo Mendez Gonzalez
//POO
//Herencia y polimorfismo

package Unidad4_Practica3;


public class Practica3_Publico extends Practica3_Vehiculo {
    
    public String tipoderuta;
    public String iniciodejornada;

    public Practica3_Publico(String tipoderuta, String iniciodejornada, String marca, String modelo) {
        super(marca, modelo);
        this.tipoderuta = tipoderuta;
        this.iniciodejornada = iniciodejornada;
    }
    
    public String recogerPasaje(){
        return "El transporte empieza a recoger pasaje a las " + iniciodejornada;
    }
    
    public String cobrarPasaje(){
        return "El chofer cobra la cuota a los pasajeros";
    }

    public String getTipoderuta() {
        return tipoderuta;
    }

    public void setTipoderuta(String tipoderuta) {
        this.tipoderuta = tipoderuta;
    }

    public String getIniciodejornada() {
        return iniciodejornada;
    }

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
        return "Practica3_Publico{" + "tipoderuta=" + tipoderuta + ", iniciodejornada=" + iniciodejornada + '}';
    }
    
    
}
