/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rekapkeuanganapp;

import java.sql.Connection;

public class RekapKeuanganApp {

    public static void main(String[] args) {
        
        System.out.println("Menguji Koneksi...");
        Connection tesKoneksi = KoneksiDB.getKoneksi();
        
        if (tesKoneksi != null) {
            System.out.println("Status: Aplikasi Berhasil Terhubung ke Database!");
        } else {
            System.out.println("Status: Koneksi Gagal, Perlu Cek Konfigurasi.");
        }
    }
}