public class MainOjek {
    public static void main(String[] args) {
        System.out.println("=== OJEK ONLINE JAKARTA ===");

        Ojek ojek1 = new Ojek(5.0);
        Ojek ojek2 = new Ojek(12.0);

        ojek1.tampilkanInfo();
        System.out.println();
        ojek2.tampilkanInfo();

        System.out.println();
        System.out.println("=== OJEK ONLINE JAKARTA (Diskon Mahasiswa 10%) ===");
        System.out.println("Jarak     : " + ojek1.getJarak() + " km");
        System.out.println("Biaya     : Rp. " + ojek1.diskonMahasiswa(10));
        System.out.println();
        System.out.println("Jarak     : " + ojek2.getJarak() + " km");
        System.out.println("Biaya     : Rp. " + ojek2.diskonMahasiswa(10));
    }
}
