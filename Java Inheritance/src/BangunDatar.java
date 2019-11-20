/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author nima
 */

public class BangunDatar {
   
  public static void main(String[] args) {
        int pil;
        Lingkaran l = new Lingkaran();
        Segitiga s = new Segitiga();
        Persegi p = new Persegi();
        PersegiPanjang pp = new PersegiPanjang();
        Scanner inp = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("Kalkulator Luas & Keliling");
        System.out.println("===============================================================");      
        System.out.println("1. Lingkaran 2. Segitiga 3. persegi 4. Persegi Panjang 5. Exit");
        System.out.println("===============================================================");     
        System.out.print("Pilih Menu : ");
        pil = inp.nextInt();
        switch(pil){
            case 1 : l.Lingkaran();break;
            case 2 : s.Segitiga();break;
            case 3 : p.persegi();break;
            case 4 : pp.PersegiPanjang();break;
            case 5 : System.exit(0);break;
        }
    }   
}