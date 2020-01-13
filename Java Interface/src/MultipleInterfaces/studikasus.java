/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultipleInterfaces;

/**
 *
 * @author nima
 */
interface OneInterface {
  public void mySuara(); // interface method
}

interface TwoInterface {
  public void myOtherSuara(); // interface method
}

class Suara implements OneInterface, TwoInterface {
  public void mySuara() {
    System.out.println("MabarKuy");
  }
  public void myOtherSuara() {
    System.out.println("Mohhh");
  }
}

class MainClass {
  public static void main(String[] args) {
    Suara coba = new Suara();
    coba.mySuara();
    coba.myOtherSuara();
  }
}
