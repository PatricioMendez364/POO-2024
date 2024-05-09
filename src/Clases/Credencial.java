//Patricio Arturo Mendez Gonzalez
//14 de abril de 2024
package Clases;


public class Credencial {
    
    private String nombre;
    private int edad;
    private String direccion;
    private String id;
    private char sexo;

    
    public Credencial(){}
    public Credencial(String nombre, int edad, String direccion, String id, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.id = id;
        this.sexo = sexo;
    }
    
    public String identificar(String nombre){
        return "Tu nombre es..." + nombre;
    }
    
    public String informacion(String nombre, int edad){
        return nombre + ", tienes " + edad + " anios";
    }
    
    public String permitirVotar(int edad){
        if(edad >= 18 ){
            return "Puedes votar";
        } else {
            return "No puedes votar";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Credencial{" + "nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + ", id=" + id + ", sexo=" + sexo + '}';
    }
    
    
    
}
