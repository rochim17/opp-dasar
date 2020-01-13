/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studykasus;

/**
 *
 * @author nima
 */
class Mobil {
    public void jenismobil(){
        System.out.println("Jenis Jenis mobil");
    }
}
class Sedan extends Mobil {
  public void jenismobil() {
    System.out.println("Contoh Mobil Sedan: Honda All New City");
  }
}

class Sport extends Mobil {
  public void jenismobil() {
    System.out.println("Contoh Mobil Sport: Lamborghini Gallardo");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Mobil myMobil = new Mobil();  // Create a Animal object
    Mobil mySedan = new Sedan();  // Create a Pig object
    Mobil mySport = new Sport();  // Create a Dog object
    myMobil.jenismobil();
    mySedan.jenismobil();
    mySport.jenismobil();
  }
}