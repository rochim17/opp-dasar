
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
public class Studikasus {

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Masukkan Nama,Umur,Gaji:");

    // String input
    String nama = myObj.nextLine();

    // Numerical input
    int umur = myObj.nextInt();
    double gaji = myObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + nama);
    System.out.println("Age: " + umur);
    System.out.println("Salary: " + gaji);
  }
}  
