//Patricio Arturo Mendez Gonzalez
//14 de abril de 2024
package Clases;


public class Casa {
    
    private String direccion;
    private String color;
    private int metroscuadrados;
    private int habitaciones;
    private int ventanas;
    
    public Casa(){}

    public Casa(String direccion, String color, int metroscuadrados, int habitaciones, int ventanas) {
        this.direccion = direccion;
        this.color = color;
        this.metroscuadrados = metroscuadrados;
        this.habitaciones = habitaciones;
        this.ventanas = ventanas;
    }
    
    public String abrirPuerta(boolean abrir){
        if(abrir == true){
            return "*Se abre la puerta*";
        } else {
            return "Te quedas afuera :|*";
        }
    }
            
    public String abrirVentana(boolean ventana){
        if(ventana == true){
        return "*Se abre la ventana*";
        } else {
        return "*Hace calor*";
        }
    }
    
    public String encenderLuces(boolean luces){
        if(luces == true){
            return "*Se encienden las luces*";
        } else {
            return "No ves nada";
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMetroscuadrados() {
        return metroscuadrados;
    }

    public void setMetroscuadrados(int metroscuadrados) {
        this.metroscuadrados = metroscuadrados;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }
    
    

    @Override
    public String toString() {
        return "Casa{" + "direccion=" + direccion + ", color=" + color + ", metroscuadrados=" + metroscuadrados + ", habitaciones=" + habitaciones + ", ventanas=" + ventanas + '}';
    }
    
    
}
