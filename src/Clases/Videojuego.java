//Patricio Arturo Mendez Gonzalez
//13 de abril de 2024
package Clases;


public class Videojuego {
    
    private String titulo;
    private int  año;
    private String calidadgrafica;
    private double pesoGB;
    private String trama;

    public Videojuego(){}
    public Videojuego(String titulo, int año, String calidadgrafica, double pesoGB, String trama) {
        this.titulo = titulo;
        this.año = año;
        this.calidadgrafica = calidadgrafica;
        this.pesoGB = pesoGB;
        this.trama = trama;
    }
    
    public String jugar(boolean respuesta){
        if(respuesta == true){
            return "*Jugando al videojuego";
        } else {
            return "...";
        }
    } 
    
    public String mostrarPuntaje(int puntos){
        return "Tu puntuacion es... " + puntos;
    }
    
    public String controles(String tipodemando){
        return "El periferico con el que juegas es..." + tipodemando;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getCalidadgrafica() {
        return calidadgrafica;
    }

    public void setCalidadgrafica(String calidadgrafica) {
        this.calidadgrafica = calidadgrafica;
    }

    public double getPesoGB() {
        return pesoGB;
    }

    public void setPeso(double pesoGB) {
        this.pesoGB = pesoGB;
    }

    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "titulo=" + titulo + ", a\u00f1o=" + año + ", calidadgrafica=" + calidadgrafica + ", pesoGB=" + pesoGB + ", trama=" + trama + '}';
    }
    
    
    
}
