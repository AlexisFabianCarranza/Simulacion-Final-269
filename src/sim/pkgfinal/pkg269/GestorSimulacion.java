/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sim.pkgfinal.pkg269;

import Business_Logic.Evento;
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
   private Double reloj;
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
   
   private ArrayList<Evento> manejoEventos;
   private ObservableList<VectorEstado> vectoresEstados;
   private Double tiempoFuncionamiento;
   private VectorEstado vectorEstado;
   private Integer cantSimulacion;

    public GestorSimulacion(Integer cantSimulacion) {
        this.reloj = 0.0;
        this.cantSimulacion = cantSimulacion;
        this.wm1 = new WashingMachine(this.reloj);
        this.wm2 = new WashingMachine(this.reloj);
        this.wm3 = new WashingMachine(this.reloj);
        this.wm4 = new WashingMachine(this.reloj);
        this.wm5 = new WashingMachine(this.reloj);
        this.wm6 = new WashingMachine(this.reloj);
        this.wm7 = new WashingMachine(this.reloj);
        this.wm8 = new WashingMachine(this.reloj);
        this.m1  = new Mechanic();
        this.m2  = new Mechanic();
        this.m3  = new Mechanic();
        this.manejoEventos = new ArrayList();
        this.manejoEventos.add(wm1);
        this.manejoEventos.add(wm2);
        this.manejoEventos.add(wm3);
        this.manejoEventos.add(wm4);
        this.manejoEventos.add(wm5);
        this.manejoEventos.add(wm6);
        this.manejoEventos.add(wm7);
        this.manejoEventos.add(wm8);
        this.manejoEventos.add(m1);
        this.manejoEventos.add(m2);
        this.manejoEventos.add(m3);      
        this.tiempoFuncionamiento = 0.0;
    }
    
    public Integer buscarEventoSiguiente(){
        // 0 -> wm1
        // 1 -> wm2
        // 2 -> wm3
        // 3 -> wm4
        // 4 -> wm5
        // 5 -> wm6
        // 6 -> wm7
        // 7 -> wm8
        // 8 -> m1
        // 9 -> m2
        // 10 -> m3
        int aux = 0;
        for(int i = 0 ; i< this.manejoEventos.size(); i++){
            Evento e = this.manejoEventos.get(i);
            if(e.getTiempoProximoEvento() > aux){
                aux = i;
            }
        }
        return aux;
    }
   
    public void calcularFilaPolitica1(){
       for(int i = 0; i < this.cantSimulacion ; i++){
           if ( i == 0 ){
               this.vectorEstado = new VectorEstado(reloj , wm1,wm2,wm3,wm4,wm5,wm6,wm7,wm8,m1,m2,m3,tiempoFuncionamiento);
               this.vectoresEstados.add(this.vectorEstado);
           }
           int proximoEvento = this.buscarEventoSiguiente();
           if(proximoEvento == 0){
           
           }
           if(proximoEvento == 1){
           
           }
           if(proximoEvento == 2){
           
           }
           if(proximoEvento == 3){
           
           }
           if(proximoEvento == 4){
           
           }
           if(proximoEvento == 5){
           
           }
           if(proximoEvento == 6){
           
           }
           if(proximoEvento == 7){
           
           }
           if(proximoEvento == 8){
           
           }
           if(proximoEvento == 9){
           
           }
           if(proximoEvento == 10){
           
           }
       }
       
       
       
        
   }
    
    private void generarFallaLavadora(WashingMachine wm){
        this.reloj = wm.getHoraFalla();

        //Busco un mecanico para que lo pueda arreglar
        if(m1.getEstado() == "L"){
        
        }
        else if(m2.getEstado() == "L"){
        
        }
        else if(m3.getEstado() == "L"){
        
        }
        
        
        
        
    }
   
   
}
