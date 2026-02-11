/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rekapkeuanganapp; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class KoneksiDB {
    
    private static final String URL = "jdbc:mysql://localhost:3306/db_rekap_keuangan"; 
    private static final String USERNAME = "root"; 
    private static final String PASSWORD = "";     
    
    public static int ID_USER_AKTIF = 0;
    public static Connection getKoneksi() {
        Connection koneksi = null;
        try {
            koneksi = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Koneksi ke Database Berhasil!");
            
        } catch (SQLException e) {
            System.err.println("Koneksi Gagal! Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal! Pastikan XAMPP/WAMP Berjalan.");
        }
        return koneksi;
    }
}