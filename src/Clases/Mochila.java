//Patricio Arturo Mendez Gonzalez
//14 de abril de 2024
package Clases;


public class Mochila {
    
    private String marca;
    private String color;
    private int compartimentos;
    private int correas;
    private int cierres;

    public Mochila() {}

    public Mochila(String marca, String color, int compartimentos, int correas, int cierres) {
        this.marca = marca;
        this.color = color;
        this.compartimentos = compartimentos;
        this.correas = correas;
        this.cierres = cierres;
    }
    
    public String abrirMochila(boolean abrir){
        if(abrir == true){
            return "*Abres la mochila*";
        } else {
            return "*La mochila sigue cerrada*";
        }
    }
    
    public String guardarCosas(String cosas){
        return "Metiste " + cosas + " en la mochila";
    }
    
    public String sacarCosas(String cosas){
        return "Sacaste " + cosas + " de la mochila";
    }    

    @Override
    public String toString() {
        return "Mochila{" + "marca=" + marca + ", color=" + color + ", compartimentos=" + compartimentos + ", correas=" + correas + ", cierres=" + cierres + '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCompartimentos() {
        return compartimentos;
    }

    public void setCompartimentos(int compartimentos) {
        this.compartimentos = compartimentos;
    }

    public int getCorreas() {
        return correas;
    }

    public void setCorreas(int correas) {
        this.correas = correas;
    }

    public int getCierres() {
        return cierres;
    }

    public void setCierres(int cierres) {
        this.cierres = cierres;
    }
    
    
    
}
