//9 de mayo de 2024
//Lista de 10 alumnos con promedio
//Dar de alta a los compañeros
//Obtener y mostrar el promedio del grupo
//Joption y que ingrese nombre y promedio en una sola linea y que
//cuando se entre un espacio vacio, termine de leer a los alumnos
package Unidad3;

import java.util.ArrayList;


public class Lista10Alumnos {
    public static void main (String[] args){
        
        ArrayList <ClaseAlumno> TI202 = new ArrayList<>();
        
        TI202.add(new ClaseAlumno("Patricio", 8));
        TI202.add(new ClaseAlumno("Erik", 8));
        TI202.add(new ClaseAlumno("Bren", 9));
        TI202.add(new ClaseAlumno("Isabel", 9));
        TI202.add(new ClaseAlumno("Liz", 8));
        TI202.add(new ClaseAlumno("Guadalupe", 7));
        TI202.add(new ClaseAlumno("Josue", 10));
        TI202.add(new ClaseAlumno("Ramon", 8));
        TI202.add(new ClaseAlumno("Angel", 9));
        TI202.add(new ClaseAlumno("Iris", 9));
        
        for(int i = 0; i < TI202.size(); i++ ){
            System.out.println("Alumno " + (i + 1) + " = " + TI202.get(i));
        }
        
        double promedio = 0;
        for (int i = 0; i < TI202.size(); i++) {
            promedio = promedio + TI202.get(i).getCalif();       
        }
        double promediofinal = promedio / TI202.size();

        System.out.println("El promedio de los alumnos del grupo es... " + promediofinal);
        
        
        
    }
}

