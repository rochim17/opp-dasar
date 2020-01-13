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
//kelas ini tidak bisa membuat objek sendiri. tapi hanya bisa memanggil dari kelas lain(pewarisan)
public class classabstract {
    public static void main(String[] args){
        Student myObj = new Student(); 
        
    System.out.println("Nama : " + myObj.namadpn+" "+myObj.namablk);
    System.out.println("Email : " + myObj.email);
    System.out.println("No.Hp :" +myObj.nohp);
    System.out.println("Umur: " +myObj.age);
    System.out.println("Alamat : "+myObj.alamat);
    myObj.study();
    }
}
