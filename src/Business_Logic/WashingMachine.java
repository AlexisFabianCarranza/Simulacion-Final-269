/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business_Logic;

import Distributions.Exponential;
import java.util.Random;

/**
 *
 * @author acarranza
 */
public class WashingMachine implements Evento{
    private String estado; //EF('En funcionamiento') ER('En reparacion')
    private Double rnd;
    private Double tiempoFalla;
    private Double horaFalla;
    private Random generadorAleatoreos;
    private Exponential exp;
    
    public WashingMachine(Double reloj) {
        this.estado = "EF";
        this.generadorAleatoreos = new Random();
        this.exp = new Exponential(4.0);
        this.rnd = this.generadorAleatoreos.nextDouble();
        this.tiempoFalla = this.exp.calcularExp(this.rnd);
        this.horaFalla = reloj + this.tiempoFalla;
    }
    
    public void generarProximaFalla(){
        this.rnd = this.generadorAleatoreos.nextDouble();
        this.tiempoFalla = this.exp.calcularExp(this.rnd);
        this.horaFalla = this.horaFalla + this.tiempoFalla;
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

    public Double getRnd() {
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

    public void setRnd(Double rnd) {
        this.rnd = rnd;
    }

    public void setTiempoFalla(Double tiempoFalla) {
        this.tiempoFalla = tiempoFalla;
    }

    public void setHoraFalla(Double horaFalla) {
        this.horaFalla = horaFalla;
    }

    @Override
    public Double getTiempoProximoEvento() {
        return this.horaFalla;
    }
    
    
    
    
    
}
