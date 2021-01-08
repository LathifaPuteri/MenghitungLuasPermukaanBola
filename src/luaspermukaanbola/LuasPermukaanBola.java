/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luaspermukaanbola;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class LuasPermukaanBola {
//mendeklarasikan variabel
int r;
double phi = 3.14;
double hasil;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //membua scanner
    Scanner input = new Scanner (System.in);
    
    //membuat objek baru
    LuasPermukaanBola luaspermukaan = new LuasPermukaanBola();
    
    //user menginputkan jari-jari lingkaran
    System.out.print("Jari-jari lingkaran : ");
    luaspermukaan.r = input.nextInt();

    //rumus luas permukaan bola
    luaspermukaan.hasil = 4*(luaspermukaan.phi)*(luaspermukaan.r)*(luaspermukaan.r);
    
    //hasil
    System.out.println("Hasil = "+luaspermukaan.hasil);
    }
}
