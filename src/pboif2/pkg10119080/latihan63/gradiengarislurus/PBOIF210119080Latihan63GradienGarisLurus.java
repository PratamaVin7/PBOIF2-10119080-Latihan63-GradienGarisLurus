/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan63.gradiengarislurus;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Gradien Garis Lurus
 */
public class PBOIF210119080Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat koordinat1, koordinat2;
        int x1,y1,x2,y2;
        
        koordinat1 = new Koordinat(2, 10, 5, 7);
        x1 = koordinat1.getX1();
        y1 = koordinat1.getY1();
        x2 = koordinat1.getX2();
        y2 = koordinat1.getY2();
        System.out.println("Garis yang melalui titik ("+x1+","+y1+") dan "
                           + "("+x2+","+y2+")");
        System.out.println("memiliki gradien sebesar " + 
                           koordinat1.hitungGradien());
        
        koordinat2 = new Koordinat(5, 1, 3, 12);
        x1 = koordinat2.getX1();
        y1 = koordinat2.getY1();
        x2 = koordinat2.getX2();
        y2 = koordinat2.getY2();
        System.out.println("Garis yang melalui titik ("+x1+","+y1+") dan "
                           + "("+x2+","+y2+")");
        System.out.println("memiliki gradien sebesar " + 
                           koordinat2.hitungGradien());
    }
    
}