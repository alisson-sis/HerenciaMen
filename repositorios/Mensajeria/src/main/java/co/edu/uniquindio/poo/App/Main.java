package co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.Model.Envio;
import co.edu.uniquindio.poo.Model.envioNacional;
import co.edu.uniquindio.poo.Model.envioInternacional;
import co.edu.uniquindio.poo.Model.envioExpress;

public class Main {
        public static void main(String[] args) {

            Envio envio1 = new envioNacional("N001", "Armando Mendoza", 3.0,
                    "Medellin", true);

            Envio envio2 = new envioExpress("E001", "Betty Pinzon", 2.0,
                    "Cali", false, 12);

            Envio envio3 = new envioInternacional("I001", "Mario Calderon", 4.5,
                    "Estados Unidos", true);

            System.out.println("RESULTADOS DE COSTOS ");
            System.out.println("Costo Envío Nacional: " + envio1.calcularCosto());
            System.out.println("Costo Envío Exprés: " + envio2.calcularCosto());
            System.out.println("Costo Envío Internacional: " + envio3.calcularCosto());
        }
    }

