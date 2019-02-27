/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sim.pkgfinal.pkg269;

import Business_Logic.ExternalService;
import Business_Logic.Mechanic;
import Business_Logic.VectorEstado;
import Business_Logic.WashingMachine;
import java.util.ArrayList;
import javafx.collections.ObservableList;

/**
 *
 * @author acarranza
 */
public class GestorSimulacion {
   private WashingMachine wm1;
   private WashingMachine wm2;
   private WashingMachine wm3;
   private WashingMachine wm4;
   private WashingMachine wm5;
   private WashingMachine wm6;
   private WashingMachine wm7;
   private WashingMachine wm8;
   private Mechanic m1;
   private Mechanic m2;
   private Mechanic m3;
   private ExternalService es;
   
   //private ArrayList<> eventos;
   
   private Double tiempoFuncionamiento;
   
   private Double cantSimulacion;

    public GestorSimulacion(Double cantSimulacion) {
        this.cantSimulacion = cantSimulacion;
        this.wm1 = new WashingMachine();
        this.wm2 = new WashingMachine();
        this.wm3 = new WashingMachine();
        this.wm4 = new WashingMachine();
        this.wm5 = new WashingMachine();
        this.wm6 = new WashingMachine();
        this.wm7 = new WashingMachine();
        this.wm8 = new WashingMachine();
        this.m1  = new Mechanic();
        this.m2  = new Mechanic();
        this.m3  = new Mechanic();
        this.es  = new ExternalService();
    }
    
    public void buscarEventoSiguiente(){
        
    }
   
   
   
   private ObservableList<VectorEstado> vectoresEstados;
   
   private void calcularFilaPolitica1(){
        
   }
   
   
}
