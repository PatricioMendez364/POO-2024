//Patricio Arturo Mendez Gonzalez
//14 de abril de 2024
package Clases;


public class Televisor {
    
    private String marca;
    private String señal;
    private String color;
    private String relaciondeaspecto;
    private int pulgadas;
    
    public Televisor(){}

    public Televisor(String marca, String señal, String color, String relaciondeaspecto, int pulgadas) {
        this.marca = marca;
        this.señal = señal;
        this.color = color;
        this.relaciondeaspecto = relaciondeaspecto;
        this.pulgadas = pulgadas;
    }
    
    public String encender(boolean encender){
        if(encender == true){
            return "*Se enciende la TV*";
        } else {
            return "La television esta apagada";
        }
    }
    
    public String cambiarCanal(int canal){
        return switch (canal) {
            case 1 -> "Bob Esponja";
            case 2 -> "La familia P.Luche";
            case 3 -> "El chavo";
            default -> "No hay señal";
        };
    }
    
    public String apagar(boolean apagar){
        if(apagar == true){
            return "-Apagando-";
        } else {
            return "*Sigue reproduciendo el programa";
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSeñal() {
        return señal;
    }

    public void setSeñal(String señal) {
        this.señal = señal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRelaciondeaspecto() {
        return relaciondeaspecto;
    }

    public void setRelaciondeaspecto(String relaciondeaspecto) {
        this.relaciondeaspecto = relaciondeaspecto;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Televisor{" + "marca=" + marca + ", se\u00f1al=" + señal + ", color=" + color + ", relaciondeaspecto=" + relaciondeaspecto + ", pulgadas=" + pulgadas + '}';
    }
    
    
    
    
}
