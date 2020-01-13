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
class MyClassProtected {
    protected String namadpn= "Abdur Rochim";
    protected String namablk= "Musa";
    protected String email = "artfamily017@gmail.com";
    protected String nohp = "+6289668488316";
    protected int age = 20;
    protected String alamat = "Pandaan";
}

class Student extends MyClassProtected{
    private int angkat = 2018;
    public static void main(String[] args){
        Student myObj = new Student();
        
    System.out.println("Nama : " + myObj.namadpn+" "+myObj.namablk);
    System.out.println("Email : " + myObj.email);
    System.out.println("No.Hp :" +myObj.nohp);
    System.out.println("Umur: " +myObj.age);
    System.out.println("Alamat : "+myObj.alamat);
    System.out.println("Angkatan : "+myObj.angkat);
    }

}

