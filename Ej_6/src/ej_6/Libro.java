package ej_6;

public class Libro {
    
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    
    //-----CONSTRUCTORES-----
    public Libro() {
    }
    
    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }
    
    //-----METODOS-----
    void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    void setAutor(String autor) {
        this.autor = autor;
    }
    
    void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }
    
    void setPrestador(int prestados) {
        this.prestados = prestados;
    }
    
    String getTitulo() {
        return this.titulo;
    }
    
    String getAutor() {
        return this.autor;
    }
    
    int getEjemplares() {
        return this.ejemplares;
    }
    
    int getPrestados() {
        return this.prestados;
    }
    
    boolean prestamo() {
        if (this.ejemplares == 0) {
            return false;
        } else {
            this.ejemplares--;
            this.prestados++;
            return true;
        }
    }
    
    boolean devolucion() {
        if (this.prestados == 0) {
            return false;
        } else {
            this.ejemplares++;
            this.prestados--;
            return true;
        }
    }

    @override
    String toString() {
        return this.titulo;
    }
    
}
