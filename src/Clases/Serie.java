//Patricio Arturo Mendez Gonzalez
//13 de abril de 2024
package Clases;


public class Serie {
    
    private String nombre;
    private int episodios;
    private int temporadas;
    private int año;
    private String genero;
    
    public Serie(){}

    public Serie(String nombre, int episodios, int temporadas, int año, String genero) {
        this.nombre = nombre;
        this.episodios = episodios;
        this.temporadas = temporadas;
        this.año = año;
        this.genero = genero;
        
    }
    
    public String reproducir(boolean play){
        if(play == true){
            return "*Reproducir serie*";
        } else{
            return "*No reproducir*";
        }
    }
    
    public String pausar(boolean pausa){
        if(pausa == true){
            return "*Poner en pausa la serie*";
        } else {
            return "*Seguir reproduciend*o";
        }
    }
    
    public String saltarIntro(boolean skip){
        if(skip == true){
            return "Se omitira el intro";
        } else {
            return "Reproducir intro";
        }
    }  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    

    @Override
    public String toString() {
        return "Serie{" + "nombre=" + nombre + ", episodios=" + episodios + ", temporadas=" + temporadas + ", a\u00f1o=" + año + ", genero=" + genero + '}';
    }
      
    
    
}
