/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nima
 */
public class MyClass {
    int x;  // membuat attribute class

  // membuat kelas konstruktor untuk kelas MyClass
  public MyClass() {
    x = 5;  // mengisi nilai dari atribut x dalam MyClass
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass(); // membuat objek dalam kelas myclass(bertujuan untuk menmanggil kelas konstruktor)
    System.out.println(myObj.x); // Menampilkan hasil nilai x
  }
}
