/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package non_access_modifier_attributes;

/**
 *
 * @author nima
 */
public class finalclass {
    
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    finalclass myObj = new finalclass();
    myObj.x = 50; // variable ini akan error karena variablenya sudah ditetapkan(final)
    myObj.PI = 25; // variable ini akan error karena variablenya sudah ditetapkan(final)
    System.out.println(myObj.x);
  }
}

