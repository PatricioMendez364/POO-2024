//Patricio Arturo Mendez Gonzalez
//14 de abril de 2024
package Clases;


public class Libro {
    
    private String titulo;
    private String autor;
    private int año;
    private String editorial;
    private int paginas;
    
    public Libro(){}

    public Libro(String titulo, String autor, int año, String editorial, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.editorial = editorial;
        this.paginas = paginas;
    }
    
    public String abrirLibro(boolean abrir){
        if(abrir == true){
            return "El libro se abrio...";
        } else {
            return "Es un libro nadamas";
        }
    }
    
    public String pasarPagina(int paginaactual, int paginaspasadas){
        int paginanueva = paginaactual + paginaspasadas;
        return "Estabas en la pagina " + paginaactual+ " y avanzaste a la pagina " + paginanueva;
    }
    
    public String cerrarLibro(boolean cerrar){
        if(cerrar == true){
            return "Ya terminaste de leer";
        } else {
            return "Sigues leyendo";
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", a\u00f1o=" + año + ", editorial=" + editorial + ", paginas=" + paginas + '}';
    }
    
    
    
}
