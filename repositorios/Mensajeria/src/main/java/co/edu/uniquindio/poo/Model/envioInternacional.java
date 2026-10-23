package co.edu.uniquindio.poo.Model;

public class envioInternacional extends Envio {

    private String paisDestino;
    private boolean necesitaSeguro;

    public envioInternacional(String codigoSeguimiento, String destinatario, double peso, String paisDestino,
                              boolean necesitaSeguro) {

        super(codigoSeguimiento, destinatario, peso);

        this.paisDestino = paisDestino;
        this.necesitaSeguro=necesitaSeguro;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public boolean isNecesitaSeguro() {
        return necesitaSeguro;
    }

    public void setNecesitaSeguro(boolean necesitaSeguro) {
        this.necesitaSeguro = necesitaSeguro;
    }

    @Override
    public double calcularCosto() {
        double costo=15000+(9000*peso);
        if(necesitaSeguro==true){
            costo+=20000;
        }
        return costo;
    }
}
