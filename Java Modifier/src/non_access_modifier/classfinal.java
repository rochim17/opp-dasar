/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package non_access_modifier;

/**
 *
 * @author nima
 */
//class ini sudah bersifat final tidak bisa diubah nilai variabelnya
final class classfinal {
    protected String brand = "Ancat";
    public void cloth(){
        System.out.println("Bukan Golongan Ambyar!");
    }
}

class Brands extends classfinal{
     private String modelName = "Videre";
     public static void main (String[]args){
    Brands MyBrand= new Brands();
    MyBrand.cloth();
    System.out.println(MyBrand.brand+ " "+MyBrand.modelName);
 
}}    
