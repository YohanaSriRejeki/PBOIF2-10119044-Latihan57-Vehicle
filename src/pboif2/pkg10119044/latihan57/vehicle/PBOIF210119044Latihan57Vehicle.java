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

public class PBOIF210119044Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setBrand("Trek Bike");
        bicycle.setModel("7.4FX");
        bicycle.setGearCount(23);
        System.out.println("Brand : "+bicycle.getBrand());
        System.out.println("Model : "+bicycle.getModel());
        System.out.println("Jumlah Gear : "+bicycle.getGearCount()+"\n");
        
        Skateboard skateboard = new Skateboard();
        skateboard.setBrand("Ally Skate");
        skateboard.setModel("Rocket");
        skateboard.setBoardLength(54.5);
        System.out.println("Brand : "+skateboard.getBrand());
        System.out.println("Model : "+skateboard.getModel());
        System.out.println("Panjangnya Board : "+skateboard.getBoardLength());
        
    }
    
}
