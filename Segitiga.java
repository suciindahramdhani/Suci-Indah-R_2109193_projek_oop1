package segitiga;

public class Segitiga {
    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga () {
    }

    // Constructor untuk mengisi alas, tinggi, dan sisi
    public Segitiga (double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    // Method untuk menghitung luas segitiga
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    // Method untuk menghitung keliling segitiga
    public double getKeliling() {
        return sisi + sisi + sisi;
    }

    public static void main(String[] args) {
        // Contoh penggunaan class Triangle
        Segitiga segitiga = new Segitiga(30, 10, 30);

        double luas = segitiga.getLuas();
        double keliling = segitiga.getKeliling();

        System.out.println("Luas segitiga: " + luas + " cm²");
        System.out.println("Keliling segitiga: " + keliling + " cm");
}
}