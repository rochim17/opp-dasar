/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nima
 */
public class constructor {
    long modelNIM;
 String modelNama;
 public constructor(long NIM, String nama){
     modelNIM = NIM;
     modelNama = nama;
}
  public static void main(String[]args){
     constructor myProfile = new constructor(201869040004L,"Abdur Rochim Musa");
     System.out.println(myProfile.modelNIM+" "+myProfile.modelNama);
 }
}
