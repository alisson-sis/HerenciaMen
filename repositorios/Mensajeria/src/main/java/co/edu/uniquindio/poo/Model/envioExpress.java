package co.edu.uniquindio.poo.Model;


public class envioExpress extends envioNacional {

    private int horasMaximas;

    public envioExpress(String codigoSeguimiento, String destinatario, double peso, String ciudadEntrega,
                        boolean requerirDomicilio, int horasMaximas) {

        super(codigoSeguimiento, destinatario, peso, ciudadEntrega, requerirDomicilio);

        this.horasMaximas = horasMaximas;
    }

    public int getHorasMaximas() {

        return horasMaximas;
    }

    public void setHorasMaximas(int horasMaximas) {

        this.horasMaximas = horasMaximas;
    }

    @Override
    public double calcularCosto() {
        double costoNacional=super.calcularCosto();
        double costoTotal=costoNacional*1.30;

        if(horasMaximas<=24){
            costoTotal=5000;
        }
        return costoTotal;
    }
}



