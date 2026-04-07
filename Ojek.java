public class Ojek {
    private double jarak;
    private double tarifPerKm;
    private double biayaMinimal;

    public Ojek(double jarak) {
        this.jarak = jarak;
        this.tarifPerKm = 2500;
        this.biayaMinimal = 10000;
    }

    public double hitungBiaya() {
        double total = jarak * tarifPerKm;
        return Math.max(total, biayaMinimal);
    }

    public void setTarifPerKm(double tarifBaru) {
        if (tarifBaru > 0) {
            this.tarifPerKm = tarifBaru;
        }
    }

    public double diskonMahasiswa(int persen) {
        if (persen < 0) {
            persen = 0;
        } else if (persen > 100) {
            persen = 100;
        }
        double biaya = hitungBiaya();
        return biaya - (biaya * persen / 100.0);
    }

    public void tampilkanInfo() {
        System.out.println("Jarak     : " + jarak + " km");
        System.out.println("Biaya     : Rp. " + hitungBiaya());
    }

    public double getJarak() {
        return jarak;
    }
}
