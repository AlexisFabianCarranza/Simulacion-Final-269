/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business_Logic;

import java.util.Random;

/**
 *
 * @author acarranza
 */
public class Mechanic implements Evento{
    private String estado; // L ('Libre') R ('Reparando')
    private Double rnd;
    private Double tiempoReparacion;
    private Double horaFinReparacion;
    private Random generadorAleatoreos;
    public Mechanic() {
        this.estado = "L";
    }
    
    public void ponerReparando(){
        this.estado = "R";
        this.generadorAleatoreos = new Random();
    }
    
    public void ponerLibre(){
        this.estado = "L";
    }

    public String getEstado() {
        return estado;
    }

    public Double getRnd() {
        return rnd;
    }

    public Double getTiempoReparacion() {
        return tiempoReparacion;
    }

    public Double getHoraFinReparacion() {
        return horaFinReparacion;
    }

    public void setRnd(Double rnd) {
        this.rnd = rnd;
    }

    public void setTiempoReparacion(Double tiempoReparacion) {
        this.tiempoReparacion = tiempoReparacion;
    }

    public void setHoraFinReparacion(Double horaFinReparacion) {
        this.horaFinReparacion = horaFinReparacion;
    }

    @Override
    public Double getTiempoProximoEvento() {
        return this.horaFinReparacion;
    }
    
    
    
}
