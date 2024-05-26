//ITESS
//25 de mayo de 2025
//Patricio Arturo Mendez Gonzalez
//POO
//Herencia y polimorfismo
 
package Unidad4_Practica3;

public class Practica3_Main {
    public static void main(String[] args) {
        
        //Primera parte
        
        Practica3_Persona persona = new Practica3_Persona("Patricio", 19);
        System.out.println(persona.comer());
        System.out.println(persona.dormir());
        
        System.out.println();
        
        Practica3_Empleado empleado = new Practica3_Empleado("Supervisor", 3500, "Juan", 27);
        System.out.println(empleado.comer());
        System.out.println(empleado.dormir());
        System.out.println(empleado.trabajar());
        System.out.println(empleado.cobrar());
        
        System.out.println();
        
        Practica3_Estudiante estudiante = new Practica3_Estudiante("TICS", "TI29112345", "Isaac", 21);
        System.out.println(estudiante.comer());
        System.out.println(estudiante.dormir());
        System.out.println(estudiante.estudiar());
        System.out.println(estudiante.hacerTarea());
        
        System.out.println();
        
        Practica3_Profesor profesor = new Practica3_Profesor("ITESS", "Calculo", "Profesor", 3500, "Pedro", 50);
        System.out.println(profesor.comer());
        System.out.println(profesor.dormir());
        System.out.println(profesor.trabajar());
        System.out.println(profesor.cobrar());
        System.out.println(profesor.darClase());
        System.out.println(profesor.calificar());
        
        System.out.println();
        
        Practica3_Administrativo administrativo = new Practica3_Administrativo("Mabe", "Contador", "Contador", 3000, "Raul", 33);
        System.out.println(administrativo.comer());
        System.out.println(administrativo.dormir());
        System.out.println(administrativo.trabajar());
        System.out.println(administrativo.cobrar());
        System.out.println(administrativo.hacerPapeleo());
        System.out.println(administrativo.administrar());
        
        System.out.println();
        
        //Segunda parte
        
        Practica3_Vehiculo vehiculo = new Practica3_Vehiculo("Ford", "K");
        System.out.println(vehiculo.acelerar());
        System.out.println(vehiculo.frenar());
        
        System.out.println();
        
        Practica3_Privado privado = new Practica3_Privado("Luis", 5, "Chevrolet", "Cruze");
        System.out.println(privado.acelerar());
        System.out.println(privado.frenar());
        System.out.println(privado.llevarCosas());
        System.out.println(privado.llevarGente());
        
        System.out.println();
        
        Practica3_Auto auto = new Practica3_Auto("Gris", "Manueales", "Guadalupe", 4, "Ford", "K");
        System.out.println(auto.acelerar());
        System.out.println(auto.frenar());
        System.out.println(auto.iralaEscuela());
        System.out.println(auto.iralMandado());
                
        System.out.println();
        
        Practica3_Camioneta camioneta = new Practica3_Camioneta("4x4", "Doble", "Ruben", 4, "Toyota", "Tundra");
        System.out.println(camioneta.acelerar());
        System.out.println(camioneta.frenar());
        System.out.println(camioneta.cargarMercancia());
        System.out.println(camioneta.pasear());
        
        System.out.println();
        
        Practica3_Motocicleta motocicleta = new Practica3_Motocicleta("Manuales", "Deportiva", "Pedro", 2, "Yamaha", "YZF");
        System.out.println(motocicleta.acelerar());
        System.out.println(motocicleta.frenar());
        System.out.println(motocicleta.hacerCaballito());
        System.out.println(motocicleta.rebasarAutos());
        
        System.out.println();
        
        Practica3_Publico publico = new Practica3_Publico("Terrestre", "6 A.M", "Mercedes Benz", "Gran viaje");
        System.out.println(publico.acelerar());
        System.out.println(publico.frenar());
        System.out.println(publico.recogerPasaje());
        System.out.println(publico.cobrarPasaje());
        
        System.out.println();
        
        
        
    }
    
}
