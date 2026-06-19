package ej_5;

public class Contador {
    
    private int cont;
    
    //----------CONSTRUCTORES----------
    public Contador() {  
    }
    
    public Contador(int cont) {
        es_negativo(cont);
    }
    
    public Contador(Contador conti) {
        es_negativo(conti.cont);
    }
    
    //----------METODOS----------
    
    // Lo hice en un metodo pq se usa mucho:
    void es_negativo(int valor) {
        if (valor <= 0) {
            this.cont = 0;
        } else {
            this.cont = valor;
        }
    }
    
    void setContador(int valor) {
        es_negativo(valor);
    }
    
    int getContador() {
        return this.cont;
    }
    
    void incrementar() {
        this.cont++;
    }
    
    void decrementar() {
        if (this.cont > 0) {
            this.cont--;
        } 
    }
    
}
