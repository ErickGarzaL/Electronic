/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.electrolic.entidades;
/**
 *  Declaración de la Pago
 * @author Erick,Emmnuel y Carlos
 */
public class Pago {
   
    private boolean tarjeta;
    private boolean cajero;
    private boolean aplicacion;
    private boolean sucursal;

    public boolean isTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(boolean tarjeta) {
        this.tarjeta = tarjeta;
    }

    public boolean isCajero() {
        return cajero;
    }

    public void setCajero(boolean cajero) {
        this.cajero = cajero;
    }

    public boolean isAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(boolean aplicacion) {
        this.aplicacion = aplicacion;
    }

    public boolean isSucursal() {
        return sucursal;
    }

    public void setSucursal(boolean sucursal) {
        this.sucursal = sucursal;
    }
    
}
