/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attributes;

/**
 *
 * @author nima
 */

    public class MyClassPublic {
    public static void main (String[] args){
        Person myObj = new Person();
        System.out.println("Nama : "+myObj.namadepan+" " +myObj.namabelakang);
        System.out.println("Email : "+myObj.email);
         System.out.println("No.Hp :" +myObj.nohp);
        System.out.println("Umur : "+ myObj.umur);
    }
}
