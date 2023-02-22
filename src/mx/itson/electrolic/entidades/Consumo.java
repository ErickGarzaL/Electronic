/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.electrolic.entidades;

import java.util.Date;

/**
 *  Declaración de la Consumo
 * @author Erick,Emmnuel y Carlos
 */
public class Consumo {
    
    private Total total;
    private Date fechaActual;
    private Date fechaLimite;
    private AjusteEnergia ajusteEnergia;

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public Date getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public AjusteEnergia getAjusteEnergia() {
        return ajusteEnergia;
    }

    public void setAjusteEnergia(AjusteEnergia ajusteEnergia) {
        this.ajusteEnergia = ajusteEnergia;
    }
    
}
