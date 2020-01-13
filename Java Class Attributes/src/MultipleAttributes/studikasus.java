/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultipleAttributes;

/**
 *
 * @author nima
 */
public class studikasus {
  String nmdpn = "Abdur";
  String nmblk = "Rochim Musa";
  int umur = 20;

  public static void main(String[] args) {
    studikasus myObj = new studikasus();
    System.out.println("Name: " + myObj.nmdpn + " " + myObj.nmblk);
    System.out.println("Age: " + myObj.umur);
  }
}
