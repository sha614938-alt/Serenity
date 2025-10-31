/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodingPewarisan;

/**
 *
 * @author Safira
 */
// Class Utama //
public class Main {
    public static void main(String[] args) {
        // Membuat Objek Rekam Medis
        RekamMedis rm = new RekamMedis("Budi Santoso", 35, "Jl. Mawar, Jember", "Diabetes Mellitus", "Terapi Insulin");

        // Menampilkan data rekam medis
        rm.infoRekamMedis();
    }
}