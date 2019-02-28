/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business_Logic;

/**
 *
 * @author acarranza
 */
public class VectorEstado{
    private Double reloj;
    
    private Double rnd1;
    private Double tiempoFalla1;
    private Double horaFalla1;
    private String estado1;
    
    private Double rnd2;
    private Double tiempoFalla2;
    private Double horaFalla2;
    private String estado2;
    
    private Double rnd3;
    private Double tiempoFalla3;
    private Double horaFalla3;
    private String estado3;
    
    private Double rnd4;
    private Double tiempoFalla4;
    private Double horaFalla4;
    private String estado4;
    
    private Double rnd5;
    private Double tiempoFalla5;
    private Double horaFalla5;
    private String estado5;
    
    private Double rnd6;
    private Double tiempoFalla6;
    private Double horaFalla6;
    private String estado6;
    
    private Double rnd7;
    private Double tiempoFalla7;
    private Double horaFalla7;
    private String estado7;
    
    private Double rnd8;
    private Double tiempoFalla8;
    private Double horaFalla8;
    private String estado8;
    
    private Double rndMc1;
    private Double tiempoReparacion1;
    private Double horaReparacion1;
    private String estadoMec1;
    
    private Double rndMc2;
    private Double tiempoReparacion2;
    private Double horaReparacion2;
    private String estadoMec2;
    
    private Double rndMc3;
    private Double tiempoReparacion3;
    private Double horaReparacion3;
    private String estadoMec3;
    
    private Double tiempoFuncionamiento;

    public VectorEstado(Double reloj, WashingMachine wm1,WashingMachine wm2,WashingMachine wm3,WashingMachine wm4,
                        WashingMachine wm5,WashingMachine wm6,WashingMachine wm7,WashingMachine wm8, Mechanic m1,
                        Mechanic m2, Mechanic m3, Double tiempoFuncionamiento) {
        this.reloj = reloj;
        this.rnd1 = wm1.getRnd();
        this.tiempoFalla1 = wm1.getTiempoFalla();
        this.horaFalla1 = wm1.getHoraFalla();
        this.estado1 = wm1.getEstado();
        
        this.rnd1 = wm1.getRnd();
        this.tiempoFalla1 = wm1.getTiempoFalla();
        this.horaFalla1 = wm1.getHoraFalla();
        this.estado1 = wm1.getEstado();
        
        this.rnd2 = wm1.getRnd();
        this.tiempoFalla2 = wm1.getTiempoFalla();
        this.horaFalla2 = wm1.getHoraFalla();
        this.estado2 = wm1.getEstado();
        
        this.rnd3 = wm1.getRnd();
        this.tiempoFalla3 = wm1.getTiempoFalla();
        this.horaFalla3 = wm1.getHoraFalla();
        this.estado3 = wm1.getEstado();
        
        this.rnd4 = wm1.getRnd();
        this.tiempoFalla4 = wm1.getTiempoFalla();
        this.horaFalla4 = wm1.getHoraFalla();
        this.estado4 = wm1.getEstado();
        
        this.rnd5 = wm1.getRnd();
        this.tiempoFalla5 = wm1.getTiempoFalla();
        this.horaFalla5 = wm1.getHoraFalla();
        this.estado5 = wm1.getEstado();
        
        this.rnd6 = wm1.getRnd();
        this.tiempoFalla7 = wm1.getTiempoFalla();
        this.horaFalla7 = wm1.getHoraFalla();
        this.estado7 = wm1.getEstado();
        
        this.rnd8 = wm1.getRnd();
        this.tiempoFalla8 = wm1.getTiempoFalla();
        this.horaFalla8 = wm1.getHoraFalla();
        this.estado8 = wm1.getEstado();
        
        this.rndMc1 = m1.getRnd();
        this.tiempoReparacion1 = m1.getTiempoReparacion();
        this.horaReparacion1 = m1.getHoraFinReparacion();
        this.estadoMec1 = m1.getEstado();
        this.rndMc2 = m1.getRnd();
        this.tiempoReparacion2 = m1.getTiempoReparacion();
        this.horaReparacion2 = m1.getHoraFinReparacion();
        this.estadoMec2 = m1.getEstado();
        this.rndMc3 = m1.getRnd();
        this.tiempoReparacion3 = m1.getTiempoReparacion();
        this.horaReparacion3 = m1.getHoraFinReparacion();
        this.estadoMec3 = m1.getEstado();
        
        this.tiempoFuncionamiento = tiempoFuncionamiento;
    }

    public void setReloj(Double reloj) {
        this.reloj = reloj;
    }

    public void setRnd1(Double rnd1) {
        this.rnd1 = rnd1;
    }

    public void setTiempoFalla1(Double tiempoFalla1) {
        this.tiempoFalla1 = tiempoFalla1;
    }

    public void setHoraFalla1(Double horaFalla1) {
        this.horaFalla1 = horaFalla1;
    }

    public void setEstado1(String estado1) {
        this.estado1 = estado1;
    }

    public void setRnd2(Double rnd2) {
        this.rnd2 = rnd2;
    }

    public void setTiempoFalla2(Double tiempoFalla2) {
        this.tiempoFalla2 = tiempoFalla2;
    }

    public void setHoraFalla2(Double horaFalla2) {
        this.horaFalla2 = horaFalla2;
    }

    public void setEstado2(String estado2) {
        this.estado2 = estado2;
    }

    public void setRnd3(Double rnd3) {
        this.rnd3 = rnd3;
    }

    public void setTiempoFalla3(Double tiempoFalla3) {
        this.tiempoFalla3 = tiempoFalla3;
    }

    public void setHoraFalla3(Double horaFalla3) {
        this.horaFalla3 = horaFalla3;
    }

    public void setEstado3(String estado3) {
        this.estado3 = estado3;
    }

    public void setRnd4(Double rnd4) {
        this.rnd4 = rnd4;
    }

    public void setTiempoFalla4(Double tiempoFalla4) {
        this.tiempoFalla4 = tiempoFalla4;
    }

    public void setHoraFalla4(Double horaFalla4) {
        this.horaFalla4 = horaFalla4;
    }

    public void setEstado4(String estado4) {
        this.estado4 = estado4;
    }

    public void setRnd5(Double rnd5) {
        this.rnd5 = rnd5;
    }

    public void setTiempoFalla5(Double tiempoFalla5) {
        this.tiempoFalla5 = tiempoFalla5;
    }

    public void setHoraFalla5(Double horaFalla5) {
        this.horaFalla5 = horaFalla5;
    }

    public void setEstado5(String estado5) {
        this.estado5 = estado5;
    }

    public void setRnd6(Double rnd6) {
        this.rnd6 = rnd6;
    }

    public void setTiempoFalla6(Double tiempoFalla6) {
        this.tiempoFalla6 = tiempoFalla6;
    }

    public void setHoraFalla6(Double horaFalla6) {
        this.horaFalla6 = horaFalla6;
    }

    public void setEstado6(String estado6) {
        this.estado6 = estado6;
    }

    public void setRnd7(Double rnd7) {
        this.rnd7 = rnd7;
    }

    public void setTiempoFalla7(Double tiempoFalla7) {
        this.tiempoFalla7 = tiempoFalla7;
    }

    public void setHoraFalla7(Double horaFalla7) {
        this.horaFalla7 = horaFalla7;
    }

    public void setEstado7(String estado7) {
        this.estado7 = estado7;
    }

    public void setRnd8(Double rnd8) {
        this.rnd8 = rnd8;
    }

    public void setTiempoFalla8(Double tiempoFalla8) {
        this.tiempoFalla8 = tiempoFalla8;
    }

    public void setHoraFalla8(Double horaFalla8) {
        this.horaFalla8 = horaFalla8;
    }

    public void setEstado8(String estado8) {
        this.estado8 = estado8;
    }

    public void setRndMc1(Double rndMc1) {
        this.rndMc1 = rndMc1;
    }

    public void setTiempoReparacion1(Double tiempoReparacion1) {
        this.tiempoReparacion1 = tiempoReparacion1;
    }

    public void setHoraReparacion1(Double horaReparacion1) {
        this.horaReparacion1 = horaReparacion1;
    }

    public void setEstadoMec1(String estadoMec1) {
        this.estadoMec1 = estadoMec1;
    }

    public void setRndMc2(Double rndMc2) {
        this.rndMc2 = rndMc2;
    }

    public void setTiempoReparacion2(Double tiempoReparacion2) {
        this.tiempoReparacion2 = tiempoReparacion2;
    }

    public void setHoraReparacion2(Double horaReparacion2) {
        this.horaReparacion2 = horaReparacion2;
    }

    public void setEstadoMec2(String estadoMec2) {
        this.estadoMec2 = estadoMec2;
    }

    public void setRndMc3(Double rndMc3) {
        this.rndMc3 = rndMc3;
    }

    public void setTiempoReparacion3(Double tiempoReparacion3) {
        this.tiempoReparacion3 = tiempoReparacion3;
    }

    public void setHoraReparacion3(Double horaReparacion3) {
        this.horaReparacion3 = horaReparacion3;
    }

    public void setEstadoMec3(String estadoMec3) {
        this.estadoMec3 = estadoMec3;
    }

    public void setTiempoFuncionamiento(Double tiempoFuncionamiento) {
        this.tiempoFuncionamiento = tiempoFuncionamiento;
    }

    public Double getReloj() {
        return reloj;
    }

    public Double getRnd1() {
        return rnd1;
    }

    public Double getTiempoFalla1() {
        return tiempoFalla1;
    }

    public Double getHoraFalla1() {
        return horaFalla1;
    }

    public String getEstado1() {
        return estado1;
    }

    public Double getRnd2() {
        return rnd2;
    }

    public Double getTiempoFalla2() {
        return tiempoFalla2;
    }

    public Double getHoraFalla2() {
        return horaFalla2;
    }

    public String getEstado2() {
        return estado2;
    }

    public Double getRnd3() {
        return rnd3;
    }

    public Double getTiempoFalla3() {
        return tiempoFalla3;
    }

    public Double getHoraFalla3() {
        return horaFalla3;
    }

    public String getEstado3() {
        return estado3;
    }

    public Double getRnd4() {
        return rnd4;
    }

    public Double getTiempoFalla4() {
        return tiempoFalla4;
    }

    public Double getHoraFalla4() {
        return horaFalla4;
    }

    public String getEstado4() {
        return estado4;
    }

    public Double getRnd5() {
        return rnd5;
    }

    public Double getTiempoFalla5() {
        return tiempoFalla5;
    }

    public Double getHoraFalla5() {
        return horaFalla5;
    }

    public String getEstado5() {
        return estado5;
    }

    public Double getRnd6() {
        return rnd6;
    }

    public Double getTiempoFalla6() {
        return tiempoFalla6;
    }

    public Double getHoraFalla6() {
        return horaFalla6;
    }

    public String getEstado6() {
        return estado6;
    }

    public Double getRnd7() {
        return rnd7;
    }

    public Double getTiempoFalla7() {
        return tiempoFalla7;
    }

    public Double getHoraFalla7() {
        return horaFalla7;
    }

    public String getEstado7() {
        return estado7;
    }

    public Double getRnd8() {
        return rnd8;
    }

    public Double getTiempoFalla8() {
        return tiempoFalla8;
    }

    public Double getHoraFalla8() {
        return horaFalla8;
    }

    public String getEstado8() {
        return estado8;
    }

    public Double getRndMc1() {
        return rndMc1;
    }

    public Double getTiempoReparacion1() {
        return tiempoReparacion1;
    }

    public Double getHoraReparacion1() {
        return horaReparacion1;
    }

    public String getEstadoMec1() {
        return estadoMec1;
    }

    public Double getRndMc2() {
        return rndMc2;
    }

    public Double getTiempoReparacion2() {
        return tiempoReparacion2;
    }

    public Double getHoraReparacion2() {
        return horaReparacion2;
    }

    public String getEstadoMec2() {
        return estadoMec2;
    }

    public Double getRndMc3() {
        return rndMc3;
    }

    public Double getTiempoReparacion3() {
        return tiempoReparacion3;
    }

    public Double getHoraReparacion3() {
        return horaReparacion3;
    }

    public String getEstadoMec3() {
        return estadoMec3;
    }

    public Double getTiempoFuncionamiento() {
        return tiempoFuncionamiento;
    }
    
    
    
    
    
    
}
