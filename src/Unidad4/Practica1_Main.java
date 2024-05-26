//16 de mayo de 2024
//Patricio Arturo Mendez Gonzalez
//Herencia y polimorfismo

package Unidad4;


public class Practica1_Main {
    public static void main(String[] args) {
        
        ClaseA a = new ClaseA("Hola clase ");
        System.out.println(a.mensaje());
        
        ClaseA b = new ClaseB("Hola clase ");
        System.out.println(b.mensaje());
        
        ClaseA c = new ClaseC("Hola clase ");
        System.out.println(c.mensaje());
        
        ClaseC d = new ClaseD("Hola clase ");
        System.out.println(d.mensaje());
           
    }
    
}