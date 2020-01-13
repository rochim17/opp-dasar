/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class studikasus {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/pecetakan";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // register driver
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            while (!conn.isClosed()) {
                showMenu();
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void showMenu() {
        System.out.println("\n========= MENU UTAMA =========");
        System.out.println("1. Insert Data");
        System.out.println("2. Show Data");
        System.out.println("3. Edit Data");
        System.out.println("4. Delete Data");
        System.out.println("0. Keluar");
        System.out.println("");
        System.out.print("PILIHAN> ");

        try {
            int pilihan = Integer.parseInt(input.readLine());

            switch (pilihan) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    insertBahan();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
                    updateBahan();
                    break;
                case 4:
                    deleteBahan();
                    break;
                default:
                    System.out.println("Pilihan salah!");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void showData() {
        String sql = "SELECT * FROM bahan";

        try {
            rs = stmt.executeQuery(sql);
            
            System.out.println("+---------------------------------------------+");
            System.out.println("|           DATA BAHAN DI PERCETAKAN          |");
            System.out.println("+---------------------------------------------+");

            while (rs.next()) {
                int idBahan = rs.getInt("id_bahan");
                String nama_bahan = rs.getString("nama_bahan");
                String jenis_bahan = rs.getString("jenis_bahan");
                String merk = rs.getString("merk");
                String produksi = rs.getString("produksi");               
                System.out.println(String.format("%d. %s,%s,%s,%s ", idBahan, nama_bahan, jenis_bahan,merk,produksi));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void insertBahan() {
        try {
            // ambil input dari user
            
            System.out.print("ID Bahan: ");
            int id_bahan = Integer.parseInt(input.readLine());
            System.out.print("Nama Bahan: ");
            String nama_bahan = input.readLine().trim();
            System.out.print("Jenis Bahan: ");
            String jenis_bahan = input.readLine().trim();
            System.out.print("Merk: ");
            String merk = input.readLine().trim();
            System.out.print("Produksi: ");
            String produksi = input.readLine().trim();
            // query simpan
            String sql = "INSERT INTO bahan (id_bahan,nama_bahan,jenis_bahan,merk,produksi) VALUE('%d','%s', '%s', '%s', '%s')";
            sql = String.format(sql,id_bahan, nama_bahan,jenis_bahan,merk,produksi);

            // simpan buku
            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void updateBahan() {
        try {
            
            // ambil input dari user
            System.out.print("ID yang mau diedit: ");
            int id_bahan = Integer.parseInt(input.readLine());
           
            System.out.print("Nama Bahan: ");
            String nama_bahan = input.readLine().trim();
            System.out.print("Jenis Bahan: ");
            String jenis_bahan = input.readLine().trim();
            System.out.print("Merk: ");
            String merk = input.readLine().trim();
            System.out.print("Produksi: ");
            String produksi = input.readLine().trim();
            
            // query update
            String sql = "UPDATE bahan SET  nama_bahan='"+nama_bahan+"', jenis_bahan='"+jenis_bahan+"',merk='"+merk+"',produksi='"+produksi+"' WHERE id_bahan= '"+id_bahan+"'";
            sql = String.format(sql, nama_bahan,jenis_bahan,merk,produksi);

            // update data buku
            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void deleteBahan() {
        try {
            
            // ambil input dari user
            System.out.print("ID yang mau dihapus: ");
            int id_bahan = Integer.parseInt(input.readLine());
            
            // buat query hapus
            String sql = String.format("DELETE FROM bahan WHERE id_bahan= '"+id_bahan+"'");

            // hapus data
            stmt.execute(sql);
            
            System.out.println("Data telah terhapus...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

