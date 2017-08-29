/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author SMK TELKOM
 */
public class Bola {
    public double jari;
    
    public void setJari (double r){
    jari=r;
    }
    public double showJari(){
      return jari;
    }
    public double showDiameter(){
        double diameter = jari*2;
        return diameter;
    }
    public double showVolume(){
        double volume = (4*Math.PI*jari*jari)/3;
        return volume;
    }
    public double showLuas(){
        double luas = 4*Math.PI*jari*jari;
        return luas;
    }
}
