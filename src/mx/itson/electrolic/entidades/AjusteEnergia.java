/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.electrolic.entidades;

import mx.itson.electrolic.enumeradores.Tarifa;

/**
 *  Declaración de la AjusteEnergia
 * @author Erick,Emmnuel y Carlos
 */
public class AjusteEnergia {
    
    private double lecturaAnterior;
    private double lecturaActual;
    private Tarifa tarifa;
    private Medicion medicion;

    public double getLecturaAnterior() {
        return lecturaAnterior;
    }

    public void setLecturaAnterior(double lecturaAnterior) {
        this.lecturaAnterior = lecturaAnterior;
    }

    public double getLecturaActual() {
        return lecturaActual;
    }

    public void setLecturaActual(double lecturaActual) {
        this.lecturaActual = lecturaActual;
    }


    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public Medicion getMedicion() {
        return medicion;
    }

    public void setMedicion(Medicion medicion) {
        this.medicion = medicion;
    }
    
}
