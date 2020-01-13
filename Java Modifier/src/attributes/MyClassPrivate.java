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
//kode dibawah ini dalah sebuah variable yang akan dipanggil dalam 1 class
//kode private ini merupakan kode yang antara variable dan pemanggilnya dijadikan 1 class
public class MyClassPrivate {
    private String namadpn = "Abdur Rochim";
    private String namablk = "Musa";
    private String email = "artfamily017@gmail.com";
    private String nohp = "+6289668488316";
    private int age = 20;
    private String alamat = "Pandaan";
    
    //kode dibawah ini untuk memanggil variable yang akan ditampilkan dalam output
    //kode ini juga dapat digunakan baik di class private maupun di class public
    public static void main (String[] args){
    MyClassPrivate myObj= new MyClassPrivate();
    System.out.println("Nama : " + myObj.namadpn+" "+myObj.namablk);
    System.out.println("Email : " + myObj.email);
    System.out.println("No.Hp :" +myObj.nohp);
    System.out.println("Umur: " +myObj.age);
    System.out.println("Alamat : "+myObj.alamat);
}
}
