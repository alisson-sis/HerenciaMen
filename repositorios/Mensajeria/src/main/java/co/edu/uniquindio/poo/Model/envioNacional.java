package co.edu.uniquindio.poo.Model;

public class envioNacional extends Envio {

    private String ciudadEntrega;
    private String codigo;
    protected boolean requerirDomicilio;

    public envioNacional(String codigoSeguimiento, String destinatario, double peso, String ciudadEntrega,
                         boolean requerirDomicilio) {

        super(codigoSeguimiento, destinatario, peso);

        this.ciudadEntrega = ciudadEntrega;
        this.requerirDomicilio = requerirDomicilio;
    }

    public String getCiudadEntrega() {

        return ciudadEntrega;
    }

    public void setCiudadEntrega(String ciudadEntrega) {

        this.ciudadEntrega = ciudadEntrega;
    }

    public String getCodigo() {

        return codigo;
    }

    public void setCodigo(String codigo) {

        this.codigo = codigo;
    }

    public boolean isRequerirDomicilio() {

        return requerirDomicilio;
    }

    public void setRequerirDomicilio(boolean requerirDomicilio) {

        this.requerirDomicilio = requerirDomicilio;
    }

    @Override
    public double calcularCosto() {
        double costo= 6000+(2000* peso);
        if(requerirDomicilio==true){
            costo+=3000;
        }
        return costo;
    }
}
