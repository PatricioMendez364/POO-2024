//Patricio Arturo Mendez Gonzalez
//14 de abril de 2024
package Clases;


public class Persona {
    
    private String nombre;
    private int edad;
    private char sexo;
    private double estatura;
    private String nacionalidad;
    
    public Persona(){}

    public Persona(String nombre, int edad, char sexo, double estatura, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estatura = estatura;
        this.nacionalidad = nacionalidad;
    }

    
    public String comer(String comida){
        return "Que rica estaba la comida";
    }
    
    public String dormir(boolean sueño){
        if(sueño == true){
            return "Tengo suenio... Zzzzzz";
        } else {
            return "No tengo sueño";
        }
    }
    
    public String respirar(boolean respirar){
        if(respirar == true){
            return "*Snif* Ahhh... Que rico huele";
        } else {
            return "No puedo respirar... X_X";
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", estatura=" + estatura + ", nacionalidad=" + nacionalidad + '}';
    }
    
    
    
}
