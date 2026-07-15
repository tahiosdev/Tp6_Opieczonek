package ej_6;

public class Ej_6 {

    public static void main(String[] args) {
        
        Libro librito = new Libro("Los tres chanchitos", "Anonimo?", 10, 0);

        System.out.println("Titulo: " + librito.getTitulo);
        System.out.println("Autor: " + librito.getAutor);
        System.out.println("Ejemplares: " + librito.getEjemplares);
        System.out.println("Prestados: " + librito.getPrestados);
        
    }
    
}
