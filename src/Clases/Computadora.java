//Patricio Arturo Mendez Gonzalez
//14 de abril de 2024
package Clases;


public class Computadora {
    
    private String marca;
    private String modelo;
    private int ram;
    private int almacenamiento;
    private String resolucion;
    
    public Computadora(){}
    
    public Computadora(String marca, String modelo, int ram, int almacenamiento, String resolucion) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.resolucion = resolucion;
    }
    
    public String encender(boolean encender){
        if(encender == true){
            return "-Inicializando-";
        } else {
            return "...";
        }
    }
    
    public String abrirProgramas(int programas){
        switch (programas) {
            case 1:
                return "Netbeans";
            case 2: 
                return "Word";
            case 3: 
                return "Minecraft";
            default:
                return "Seleccione un programa valido (1 - 3)";
        }
    }
    
    public String apagar(boolean apagar){
        if(apagar == true){
            return "Apagando...";
        } else {
            return "*Se prende el ventilador*";
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

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    
    
    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", ram=" + ram + ", almacenamiento=" + almacenamiento + ", resolucion=" + resolucion + '}';
    }
    
    
    
}
