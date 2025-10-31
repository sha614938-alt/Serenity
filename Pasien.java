package CodingPewarisan;

/**
 *
 * @author Safira
 */
public class Pasien {
    // Properti //
    protected String nama;
    protected int usia;
    protected String alamat;

    // Konstruktor //
    public Pasien(String nama, int usia, String alamat) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }

    // Metode untuk menampilkan informasi pasien //
    public void infoPasien() {
        System.out.println("Nama      : " + nama);
        System.out.println("Usia      : " + usia);
        System.out.println("Alamat    : " + alamat);
    }
}