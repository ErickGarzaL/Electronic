/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.electrolic.entidades;

import java.util.List;

/**
 *  Declaración de la Cliente
 * @author Erick,Emmnuel y Carlos
 */
public class Cliente {
    
    private String nombre;
    private String domicilio;
    private Consumo consumo;
    private List <Historial> historial;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Consumo getConsumo() {
        return consumo;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }

    public List <Historial> getHistorial() {
        return historial;
    }

    public void setHistorial(List <Historial> historial) {
        this.historial = historial;
    }
    
}
