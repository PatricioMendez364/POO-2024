//16 de mayo de 2024
//Patricio Arturo Mendez Gonzalez
//Herencia y polimorfismo

package Unidad4;

    public class ClaseD extends ClaseC {

    public ClaseD(String saludo) {
        super(saludo);
    }
    
    @Override
    public String mensaje(){
        return saludo + "D";
    }
         
}
