/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.electrolic.entidades;

/**
 *  Declaración de la Medicion
 * @author Erick,Emmnuel y Carlos
 */
public class Medicion {
    
   private int numMedidor;
   private double consumoKwh;

    public int getNumMedidor() {
        return numMedidor;
    }

    public void setNumMedidor(int numMedidor) {
        this.numMedidor = numMedidor;
    }

    public double getConsumoKwh() {
        return consumoKwh;
    }

    public void setConsumoKwh(double consumoKwh) {
        this.consumoKwh = consumoKwh;
    }
  
    
}
