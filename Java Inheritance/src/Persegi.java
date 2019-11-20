
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nima
 */
public class Persegi extends BangunDatar {
    public void persegi(){
        double sb,lb,kb;
        Scanner c = new Scanner(System.in);
        System.out.println("PERSEGI");
        System.out.println("=============");
        System.out.println("Masukkan sisi : ");
        sb = c.nextDouble();      
        lb = sb*sb;
        kb = 4*sb;
        System.out.println("Luas persegi adalah : "+lb);
        System.out.println("Keliling persegi adalah : "+kb);
    }   
}

