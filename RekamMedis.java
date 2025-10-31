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
// Subclass RekamMedis yang mewarisi dari Pasien
public class RekamMedis extends Pasien {
    private String diagnosa;
    private String perawatan;

    // Konstruktor
    public RekamMedis(String nama, int usia, String alamat, String diagnosa, String perawatan) {
        super(nama, usia, alamat); // memanggil konstruktor dari superclass
        this.diagnosa = diagnosa;
        this.perawatan = perawatan;
    }

    // Metode tambahan //
    public void infoRekamMedis() {
        super.infoPasien(); // memanggil metode dari superclass
        System.out.println("Diagnosa  : " + diagnosa);
        System.out.println("Perawatan : " + perawatan);
    }
}