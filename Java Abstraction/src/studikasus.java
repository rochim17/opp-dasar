/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nima
 */
abstract class Manusia {
  // Abstract method (does not have a body)
  public abstract void SuaraCowo();
  // Regular method
  public void Tidur() {
    System.out.println("Ngeek");
  }
}

// Subclass (inherit from Animal)
class Cowo extends Manusia {
  public void SuaraCowo() {
    // The body of animalSound() is provided here
    System.out.println("Suara Cowo : Aku Setia kok :v");
  }
}

class MainClass {
  public static void main(String[] args) {
    Cowo myCowo = new Cowo(); // Create a Pig object
    myCowo.SuaraCowo();
    myCowo.Tidur();
  }
}