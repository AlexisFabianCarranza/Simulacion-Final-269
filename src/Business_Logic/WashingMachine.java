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
public class WashingMachine {
    private String estado; //EF('En funcionamiento') ER('En reparacion')
    private Integer rnd;
    private Double tiempoFalla;
    private Double horaFalla;
    private Random generadorAleatoreos;

    public WashingMachine() {
        this.estado = "EF";
        this.generadorAleatoreos = new Random();
    }
    
    public void ponerEnFuncionamiento(){
        this.estado = "EF";
    }
    
    public void ponerEnReparacion(){
        this.estado = "ER";
    }
    
    public String getEstado() {
        return estado;
    }

    public Integer getRnd() {
        return rnd;
    }

    public Double getTiempoFalla() {
        return tiempoFalla;
    }

    public Double getHoraFalla() {
        return horaFalla;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setRnd(Integer rnd) {
        this.rnd = rnd;
    }

    public void setTiempoFalla(Double tiempoFalla) {
        this.tiempoFalla = tiempoFalla;
    }

    public void setHoraFalla(Double horaFalla) {
        this.horaFalla = horaFalla;
    }
    
    
    
    
    
}
