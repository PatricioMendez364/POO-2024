//22 de mayo de 2024
//Patricio Arturo Mendez Gonzalez
//Herencia y polimorfismo
//Tarea
package Unidad4;


    public class ClaseD_2 extends ClaseA_2 {
    
    public ClaseD_2(String mensaje) {
        super(mensaje);
    } 
    
    @Override
    public String mensaje(){
        return mensaje + "D";
    }

} 
