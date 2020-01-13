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
class MyClassDefault {
  String namadpn = "Tumini";
  String namablk = "Raisa";
  String email = "tumini@gmail.com";
  String nohp = "+6289668482585";
  int age = 30;
  String alamat = "Pandaan";
    
    public static void main (String[] args){
    MyClassDefault myObj= new MyClassDefault();
    System.out.println("Nama : " + myObj.namadpn+" "+myObj.namablk);
    System.out.println("Email : " + myObj.email);
    System.out.println("No.Hp :" +myObj.nohp);
    System.out.println("Umur: " +myObj.age);
    System.out.println("Alamat : "+myObj.alamat);
}   
}
