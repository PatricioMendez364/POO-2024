//Patricio Arturo Mendez Gonzalez
//13 de abril de 2024
package Clases;


public class Lapiz {
    
    private String color;
    private String material;
    private double tamanio;
    private double precio;
    private String marca;
    
    public Lapiz(){}

    public Lapiz(String color, String material, double tamanio, double precio, String marca) {
        this.color = color;
        this.material = material;
        this.tamanio = tamanio;
        this.precio = precio;
        this.marca = marca;
    }
    
    public String escribir(String texto){
        return texto;
    }
    
    public String dibujarPersona(boolean dibujo){
        if(dibujo == true){
            return """
                     O
                    -|-
                     ^""";
        } else {
            return " ";
        }   
        
    }
    
    public String borrar(String texto, boolean borrar){
        if(borrar == true){
            return "*Texto vacio*";
        } else {
            return texto;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Lapiz{" + "color=" + color + ", material=" + material + ", tamanio=" + tamanio + ", precio=" + precio + ", marca=" + marca + '}';
    }
    
    
}
