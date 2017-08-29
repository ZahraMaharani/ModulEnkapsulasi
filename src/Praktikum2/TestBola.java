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
public class TestBola {
    public static void main(String[]arg){
      Bola hitung = new Bola();
      double luas, volume;
      hitung.setJari(7);
      luas = hitung.showLuas();
      volume = hitung.showVolume();
      System.out.println("Jari jari adalah "+ hitung.showJari()+
              "\nDiameter adalah "+hitung.showDiameter()+"\nLuas adalah "+
              (int)Math.round(luas)+"\nVolume adalah "+(int)Math.round(volume));
    }
}
