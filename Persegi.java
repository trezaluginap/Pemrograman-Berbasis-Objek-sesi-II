public class Persegi {
    private double sisi;

    // Constructor untuk menginisialisasi sisi saat objek dibuat
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Method untuk mengatur nilai sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Method untuk mengembalikan luas persegi
    public double getLuas() {
        return sisi * sisi;
    }

    // Method untuk mengembalikan keliling persegi
    public double getKeliling() {
        return 4 * sisi;
    }

    public static void main(String[] args) {
        // Membuat objek persegi dengan sisi 5
        Persegi persegi = new Persegi(5);

        // Menampilkan luas persegi
        System.out.println("Luas Persegi: " + persegi.getLuas());

        // Menampilkan keliling persegi
        System.out.println("Keliling Persegi: " + persegi.getKeliling());

        // Mengubah nilai sisi menjadi 7
        persegi.setSisi(7);

        // Menampilkan luas dan keliling setelah mengubah nilai sisi
        System.out.println("\nSetelah mengubah nilai sisi:");
        System.out.println("Luas Persegi: " + persegi.getLuas());
        System.out.println("Keliling Persegi: " + persegi.getKeliling());
    }
}
