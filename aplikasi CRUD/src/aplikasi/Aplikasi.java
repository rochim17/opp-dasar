/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author nima
 */
public class Aplikasi {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/fakultas";
    static final String USER = "root";
    static final String PASS = "";

    // Menyiapkan objek yang diperlukan untuk mengelola database
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Melakukan koneksi ke database
        // harus dibungkus dalam blok try/catch
        try {
            // register driver yang akan dipakai
            Class.forName(JDBC_DRIVER);
            
            // buat koneksi ke database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            // buat objek statement
            stmt = conn.createStatement();
            
            // buat query ke database
            String sql = "SELECT * FROM dosen";
            
            // eksekusi query dan simpan hasilnya di obj ResultSet
            rs = stmt.executeQuery(sql);
            
            // tampilkan hasil query
            while(rs.next()){
                System.out.println("ID DOSEN: " + rs.getString("id_DOSEN"));
                System.out.println("Nama Dosen: " + rs.getString("NAMA_DOSEN"));
                System.out.println("Alamat Dosen: " + rs.getString("ALAMAT_DOSEN"));
            }
            
            stmt.close();
            conn.close();
            
        } catch (Exception e) {
            System.out.print("Datamu Salah Cuk");
        }

    }
    
}
