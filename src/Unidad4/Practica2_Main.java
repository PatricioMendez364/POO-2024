//22 de mayo de 2024
//Patricio Arturo Mendez Gonzalez
//Herencia y polimorfismo
//Tarea
package Unidad4;


public class Practica2_Main {
    public static void main(String[] args) {
        
        ClaseA_2 A = new ClaseA_2("Hola, este es el mensaje de la clase ");
        System.out.println(A.mensaje());
        
        ClaseA_2 D= new ClaseF_2("Hola, este es el mensaje de la clase ");
        System.out.println(D.mensaje());
        
        //ClaseB_2 objeto3 = new ClaseE_2("Hola, este es el mensaje de la clase ");
        //System.out.println(objeto3.mensaje());
        
        /*No se puede crear un objeto en B e instanciarlo en E, ya que la clase E
        es una subclase de C, no de B, por lo que no estan directamente relacionadas 
        esas clases.
        */ 
        
        ClaseE_2 objeto4 = new ClaseE_2("Hola, este es el mensaje de la clase ");
        System.out.println(objeto4.mensaje());
    }
}
