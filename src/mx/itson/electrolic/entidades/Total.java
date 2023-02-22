/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.electrolic.entidades;

/**
 *  Declaración de la Total
 * @author Erick,Emmnuel y Carlos
 */
public class Total {
    
    private double iva;
    private double importe;
    private double cargos;
    private double redondeo;

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getCargos() {
        return cargos;
    }

    public void setCargos(double cargos) {
        this.cargos = cargos;
    }

    public double getRedondeo() {
        return redondeo;
    }

    public void setRedondeo(double redondeo) {
        this.redondeo = redondeo;
    }
    
}
