/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author SMK TELKOM
 */
public class TestSiswa {
    
    public static void main(String args[]){
      EncapSiswa siswa = new EncapSiswa();
      siswa.setName("Zahra");
      siswa.setAge(37);
      siswa.getAddress("Malang");
      
      System.out.print("Name : "+ siswa.getName()
      + "Absen : "+siswa.getAbsen()+
       "Address : "+siswa.getAddress());
    }
}
