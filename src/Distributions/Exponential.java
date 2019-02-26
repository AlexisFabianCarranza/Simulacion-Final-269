/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distributions;

/**
 *
 * @author acarranza
 */
public class Exponential {
    private Double media;
    private Double lambda;

    public Exponential(Double media) {
        this.media = media;
    }

    public Double calcularExp(Double RND){
        return - this.media * Math.log(1-RND);
    }
    
    public Double getMedia() {
        return media;
    }

    public Double getLambda() {
        return lambda;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public void setLambda(Double lambda) {
        this.lambda = lambda;
    }
    
    
    
}
