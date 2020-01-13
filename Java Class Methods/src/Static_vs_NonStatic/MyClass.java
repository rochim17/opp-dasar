/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static_vs_NonStatic;

/**
 *
 * @author nima
 */
public class MyClass {
 
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods bisa memanggil tanpa membuat objek");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods harus memanggi dengan membuat objek");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // memanggil static method
    // myPublicMethod(); jika di kompile akan error

    MyClass myObj = new MyClass(); // membuat objek MyClass
    myObj.myPublicMethod(); //memanggil objek dalam sebuah public method
  } 
}
