package ej_4;

public class Cuenta {
    
    private String nombre;
    private String numero;
    private double interes;
    private double saldo;
    
    //-------------------------------------------
    public Cuenta(String nombre, String numero, double interes, double saldo) {
        this.nombre = nombre;
        this.numero = numero;
        this.interes = interes;
        this.saldo = saldo;
    }
    
    public Cuenta(Cuenta cuentita) { 
        this.nombre = cuentita.nombre;
        this.numero = cuentita.numero;
        this.interes = cuentita.interes;
        this.saldo = cuentita.saldo;
    }
    
    public Cuenta() {
    }
    
    
    //
    
    void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    void setNumero(String numero) {
        this.numero = numero;
    }
    
    void setInteres(double interes) {
        this.interes = interes;
    }
    
    void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    String getNombre() {
        return this.nombre;
    }
    
    String getNumero() {
        return this.numero;
    }
    
    double getInteres() {
        return this.interes;
    }
    
    double getSaldo() {
        return this.saldo;
    }
    
    boolean ingreso(double cantidad) {
        if (cantidad <= 0) {
            return false;
        } else {
            this.saldo = this.saldo + cantidad;
            return true;
        }
    }
    
    boolean reintegro(double cantidad) {
        if (cantidad <= 0) {
            return false;
        } else {
            this.saldo = this.saldo - cantidad;
            return true;
        }
    }
    
    boolean transferencia(Cuenta cuenta_destino, double cantidad) {
        if (cantidad > this.saldo) {
            return false;
        } else {
            cuenta_destino.ingreso(cantidad);
            return true;
        }
    }
    
}
