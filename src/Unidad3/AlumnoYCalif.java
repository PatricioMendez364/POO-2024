//Patricio Arturo Mendez Gonzalez
//12 de mayo de 2024

package Unidad3;

import java.util.ArrayList;
import javax.swing.JOptionPane;
 
public class AlumnoYCalif {
    public static void main(String[] args) {   
    ArrayList <ClaseAlumno> Lista = new ArrayList<>();    
    boolean bool = true;
    
    while(bool == true){
        String entrada = JOptionPane.showInputDialog(null,"Introduzca el nombre del alumno y su calificacion separados por una coma... \n O presione enter para terminar... ","Sistema",JOptionPane.INFORMATION_MESSAGE);
         if(entrada.equals("") || entrada.equals(" ")){
             bool = false;
        } else {
             String Alumnos[] = entrada.split(",");
             Lista.add(new ClaseAlumno(Alumnos[0], Double.parseDouble(Alumnos[1])));
             JOptionPane.showMessageDialog(null, "Se añadio a...\n " + Alumnos[0] + ". Promedio: " + Alumnos[1],"Alumno Agregado",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
        double promedio = 0;
        for (int i = 0; i < Lista.size(); i++) {
            promedio = promedio + Lista.get(i).getCalif();       
        }
        double promediofinal = promedio / Lista.size();
 
    
    JOptionPane.showMessageDialog(null, "Lista de alumnos... \n" + Lista + " Promedio general: " + promediofinal + "\n", "Alumno", JOptionPane.INFORMATION_MESSAGE);
    

    
    }

}

