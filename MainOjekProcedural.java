public class MainOjekProcedural {
    public static void main(String[] args) {
        System.out.println("=== OJEK PROCEDURAL JAKARTA ===");
        tampilkanBiaya(5.0, 2500, 10000);

        System.out.println();
        tampilkanBiaya(12.0, 2500, 10000);

        System.out.println();
        System.out.println("=== OJEK PROCEDURAL JAKARTA (Diskon Mahasiswa 10%) ===");
        double biaya1 = hitungBiaya(5.0, 2500, 10000);
        double biaya2 = hitungBiaya(12.0, 2500, 10000);
        System.out.println("Jarak     : 5.0 km");
        System.out.println("Biaya     : Rp. " + diskonMahasiswa(biaya1, 10));
        System.out.println();
        System.out.println("Jarak     : 12.0 km");
        System.out.println("Biaya     : Rp. " + diskonMahasiswa(biaya2, 10));
    }

    public static double hitungBiaya(double jarak, double tarifPerKm, double biayaMinimal) {
        double total = jarak * tarifPerKm;
        return Math.max(total, biayaMinimal);
    }

    public static double diskonMahasiswa(double biaya, int persen) {
        if (persen < 0) {
            persen = 0;
        } else if (persen > 100) {
            persen = 100;
        }
        return biaya - (biaya * persen / 100.0);
    }

    public static void tampilkanBiaya(double jarak, double tarifPerKm, double biayaMinimal) {
        double biaya = hitungBiaya(jarak, tarifPerKm, biayaMinimal);
        System.out.println("Jarak     : " + jarak + " km");
        System.out.println("Biaya     : Rp. " + biaya);
    }
}
