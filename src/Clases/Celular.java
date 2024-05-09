//Patricio Arturo Mendez Gonzalez
//14 de abril de 2024
package Clases;


public class Celular {
    
    private String marca;
    private String modelo;
    private int capacidadbateria;
    private int ram;
    private int almacenamiento;
    
    public Celular(){}

    public Celular(String marca, String modelo, int capacidadbateria, int ram, int almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadbateria = capacidadbateria;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }
    
    public String encender(boolean encender){
        if(encender == true){
            return "*Encendiendo*";
        } else {
            return "...";
        }
    }
    
    public String abrirApp(int app){
        switch (app) {
            case 1:
                return "Facebook";
            case 2:
                return "Instagram";
            case 3: 
                return "Whatsapp";
                
            default:
                return "Selecciona una app ";
        }
    }
    
    public String apagar(boolean apagar){
        if(apagar == true){
            return "*Apagando...*";
        } else {
            return "*Sigue funcionando...*";
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

    public int getCapacidadbateria() {
        return capacidadbateria;
    }

    public void setCapacidadbateria(int capacidadbateria) {
        this.capacidadbateria = capacidadbateria;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "Celular{" + "marca=" + marca + ", modelo=" + modelo + ", capacidadbateria=" + capacidadbateria + ", ram=" + ram + ", almacenamiento=" + almacenamiento + '}';
    } 
        
}
