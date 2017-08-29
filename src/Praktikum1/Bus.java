/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author SMK TELKOM
 */
public class Bus {
    public double penumpang;
    public double maxpenumpang;
    public double counter;
    public double penumpangbaru;
    
    public Bus(double maxpenumpang)
    {
       this.maxpenumpang = maxpenumpang;
       penumpang = 0;
    }
    
    public void addpenumpang(double penumpang)
    {
       double temp;
       temp = this.penumpang+penumpang;
       if(temp> maxpenumpang)
       {
          System.out.println("penumpang melebihi kuota");
       }else
       {
          this.penumpang=temp;
       }
    }
    
    public void getpenumpang(int password)
    {
       if (password==24)
       {
          System.out.println("Password benar");
       }else
       {
          System.out.println("Password salah");
       }
    }
    
    public void getAverage(){
      
    }
    
}
