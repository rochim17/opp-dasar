/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author nima
 */
interface Manusia {
  public void SuaraManusia(); // interface method (does not have a body)
  public void tidur(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
 class Cowo implements Manusia {
  public void SuaraManusia() {
    // The body of animalSound() is provided here
    System.out.println("suara cowo : uwuuuu");
  }
  public void tidur() {
    // The body of sleep() is provided here
    System.out.println("Ngeeek");
  }
}

class MyMain {
  public static void main(String[] args) {
    Cowo myCowo = new Cowo();  // Create a Pig object
    myCowo.SuaraManusia();
    myCowo.tidur();
  }
}
