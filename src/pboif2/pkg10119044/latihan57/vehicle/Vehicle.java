/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan57.vehicle;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan jenis-jenis vehicle
 */
public class Vehicle {
    private String myBrand;
    private String myModel;
    
    public Vehicle(){
       this.myBrand = null;
       this.myModel = null;
    }
    
    public String getBrand(){
        return myBrand;
    }
    
    public void setBrand(String brand){
        this.myBrand = brand;
    }
    
    public String getModel(){
        return myModel;
    }
    
    public void setModel(String model){
        this.myModel = model;
    }
}
