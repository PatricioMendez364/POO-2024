//22 de mayo de 2024
//Patricio Arturo Mendez Gonzalez
//Herencia y polimorfismo
//Tarea
package Unidad4;


    public class ClaseF_2 extends ClaseD_2 {
    
    public ClaseF_2(String mensaje) {
        super(mensaje);
    } 
    
    @Override
    public String mensaje(){
        return mensaje + "F";
    }

} 
