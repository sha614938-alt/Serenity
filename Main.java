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
