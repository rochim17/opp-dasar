/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModifyAttributes;

/**
 *
 * @author nima
 */
//Change the value of x to 25
public class MyClass2 {
    int x = 10;

  public static void main(String[] args) {
    MyClass2 myObj = new MyClass2();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
  }
}
