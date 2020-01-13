/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Access_Methods_With_an_Object;

/**
 *
 * @author nima
 */
public class Car {
 
  // membuat fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // membuat kecepatan() method dan menambahkan parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    Car myCar = new Car();     // membuat Objek myCar
    myCar.fullThrottle();      // memanggil fullThrottle() method
    myCar.speed(200);          // memanggil kecepatan() method
  }
}
