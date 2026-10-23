package co.edu.uniquindio.poo.Model;

public abstract class  Envio {

    protected String codigoSeguimiento;
    protected String destinatario;
    protected double peso;


    public Envio(String codigoSeguimiento, String destinatario,
                 double peso) {
        this.codigoSeguimiento = codigoSeguimiento;
        this.destinatario = destinatario;
        this.peso = peso;
    }

    public abstract double calcularCosto();
}