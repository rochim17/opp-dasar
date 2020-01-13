package Object;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nima
 */
public class MultipleObject {
    int x = 5;

  public static void main(String[] args) {
    MultipleObject myObj1 = new MultipleObject();  // Object 1
    MultipleObject myObj2 = new MultipleObject();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}

