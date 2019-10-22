/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nima
 */
public class Constructor_Parameter{
 long modelNIM;
 String modelNama;
 String modelAlamat;
 String modelJurusan;
 long modelAngkatan;
 public Constructor_Parameter(long NIM, String nama,String alamat,String jurusan,long angkatan){
     modelNIM = NIM;
     modelNama = nama;
     modelAlamat = alamat;
     modelJurusan =jurusan;
     modelAngkatan = angkatan;
 }
 
 public static void main(String[]args){
     Constructor_Parameter myProfile = new Constructor_Parameter(201869040004L,"Abdur Rochim Musa","Pandaan","Teknik Informatika",2018);
     System.out.println(myProfile.modelNIM+" "+myProfile.modelNama+" "+myProfile.modelAlamat+" "+myProfile.modelJurusan+" "+myProfile.modelAngkatan);
 }
}
