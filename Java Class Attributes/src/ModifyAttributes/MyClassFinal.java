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
//If you don't want the ability to override existing values, declare the attribute as final
public class MyClassFinal {
    final int x = 10;

  public static void main(String[] args) {
    MyClassFinal myObj = new MyClassFinal();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
