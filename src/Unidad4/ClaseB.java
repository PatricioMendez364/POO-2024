//16 de mayo de 2024
//Patricio Arturo Mendez Gonzalez
//Herencia y polimorfismo

package Unidad4;
    

    public class ClaseB extends ClaseA {

    public ClaseB(String saludo) {
        super(saludo);
    } 
    
    @Override
    public String mensaje(){
        return saludo + "B";
    }

}   
        


