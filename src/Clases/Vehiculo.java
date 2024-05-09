//Patricio Arturo Mendez Gonzalez
//13 de abril de 2024
package Clases;

public class Vehiculo {
    
    private String marca;
    private String modelo;
    private String transmision;
    private int año;
    private String color;

    public Vehiculo(String marca, String modelo, String transmision, int año, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.transmision = transmision;
        this.año = año;
        this.color = color;
    }
    
    public String avazar(boolean avanzar){
        if(avanzar == true){
            return "El auto se mueve hacia adelante";
        } else {
            return "El auto no hace nada...";
        }
    }
    
    public String frenar(boolean frenar){
        if(frenar == true){
            return "El auto acaba de frenar";
        } else {
            return "El auto continua avanzando...";
        }
    }
    
    public String retroceder (boolean retroceder){
        if(retroceder == true){
            return "El auto se mueve hacia atras";
        } else {
            return "El auto sigue en la misma situacion";
        }
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

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", transmision=" + transmision + ", a\u00f1o=" + año + ", color=" + color + '}';
    }
    
    
    
}
