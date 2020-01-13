/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddItems;
import java.util.ArrayList;
/**
 *
 * @author nima
 */


public class MyClass {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.set(0, "Opel");//Menambahkan data
    cars.remove(0);//Menghapus data
    cars.clear();//untuk mempersihkan semua data
    System.out.println(cars);//untuk menampilkan semua data
   System.out.println("Get:" +cars.get(0));//untuk mamanggil data pertama dari variable
    System.out.println(cars.size());//untuk mengetahui jumlah data
  }
}