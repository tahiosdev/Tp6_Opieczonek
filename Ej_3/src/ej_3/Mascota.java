package ej_3;

public class Mascota {
    //-----Atributos-----
    private String nombre;
    private String raza;
    private int edad;
    private double peso;
    private String codigo;
    
    //-----Sets y Gets-----
    void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    void setRaza(String raza) {
        this.raza = raza;
    }
    
    void setEdad(int edad) {
        if (edad <= 0) {
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }
    
    void setPeso(double peso) {
        if (peso <= 0) {
            this.peso = 0;
        } else {
            this.peso = peso;
        }
    }
    
    void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    String getNombre() {
        return this.nombre;
}
    
    String getRaza() {
        return this.raza;
}
    
    int getEdad() {
        return this.edad;
}
    
    double getPeso() {
        return this.peso;
    }
    
    String getCodigo() {
        return this.codigo;
    }
    
    //-----Demas Metodos-----
    void imprimirDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Raza: " + this.raza);
        System.out.println("Edad: " + this.edad);
        System.out.println("Peso: " + this.peso);
        System.out.println("Codigo: " + this.codigo);
    }
}
