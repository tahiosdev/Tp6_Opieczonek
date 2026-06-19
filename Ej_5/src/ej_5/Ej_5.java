package ej_5;

public class Ej_5 {

    public static void main(String[] args) {
        
        Contador miContador = new Contador(10);
        
        miContador.decrementar();
        System.out.println("Contador: " + miContador.getContador());
        
        miContador.incrementar();
        System.out.println("Contador: " + miContador.getContador());
        
        miContador.setContador(-12);
        System.out.println("Contador: " + miContador.getContador());
        
        miContador.setContador(15);
        System.out.println("Contador: " + miContador.getContador());
        
    }
    
}
