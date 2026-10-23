package co.edu.uniquindio.poo.Model;

import java.util.*;

public class mensajeriaEmpresa {

    private final String nombre;
    private final String nit;
    private final String telefono;
    private final String direccion;

    private final List<Envio> listEnvios = new LinkedList<>();

    public mensajeriaEmpresa(String nombre, String nit, String telefono, String direccion) {
        this.nombre = nombre;
        this.nit = nit;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    //CRUD
    //REGISTRAR
    public String registrarEnvios(Envio envio) {
        Optional<Envio> envioEncontrado = buscarEnvios(envio.codigoSeguimiento);
            if (envioEncontrado.isEmpty()) {
                listEnvios.add(envio);
                return "El envio se registro exitosamente";
            } else {
                return "no se pudo registrar";
            }
        }
        //BUSCAR
    public Optional<Envio>buscarEnvios(String codigoSeguimiento){
        for(Envio envio: listEnvios){
            if(codigoSeguimiento.equalsIgnoreCase(envio.codigoSeguimiento)){
                return Optional.of(envio);
            }
        }
        return Optional.empty();
    }
    //ELIMINAR
    public String eliminarEnvios(Envio envio) {
        Optional<Envio> envioEncontrado = buscarEnvios(envio.codigoSeguimiento);
        if (envioEncontrado.isEmpty()) {
            listEnvios.remove(envio);
            return "El envio se registro exitosamente";
        } else {
            return "no se pudo registrar";
        }

    }

    @Override
    public String toString() {
        return "mensajeriaEmpresa{" +
                "nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", listEnvios=" + listEnvios +
                '}';
    }
}

