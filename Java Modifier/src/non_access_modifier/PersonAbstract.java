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
abstract class PersonAbstract {
  public String namadpn = "Abdur Rochim";
  public String namablk = "Musa";
  public String email = "artfamily017@gmail.com";
  public String nohp = "+6289668488316";
  public int age = 20;
  public String alamat = "Pandaan";
  public abstract void study();
}
class Student extends PersonAbstract{
    public int graduationYear = 2018;
  public void study() {
    System.out.println("All Be Study");
  }
}