//ITESS
//25 de mayo de 2025
//Patricio Arturo Mendez Gonzalez
//POO
//Herencia y polimorfismo

package Unidad4_Practica3;


public class Practica3_Metro extends Practica3_Publico {
    
    String ciudad;
    String linea;

    public Practica3_Metro(String ciudad, String linea, String tipoderuta, String iniciodejornada, String marca, String modelo) {
        super(tipoderuta, iniciodejornada, marca, modelo);
        this.ciudad = ciudad;
        this.linea = linea;
    }
    
    public String pararenEstacion(){
        return "El metro de " + ciudad + " para en la estacion";
    }
    
    public String cerrarPuertas(){
        return "El metro de la linea " + linea + " se prepara para avanzar y cierra sus puertas";
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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
        return "Practica3_Metro{" + "ciudad=" + ciudad + ", linea=" + linea + '}';
    }
    
    
    
}
