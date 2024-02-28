public class Books {
    private String author;
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String title;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private double price;
    private int publisherNumber;

    public int getPublisherNumber() {
        return publisherNumber;
    }

    public void setPublisherNumber(int publisherNumber) {
        this.publisherNumber = publisherNumber;
    }

    // Constructor untuk menginisialisasi nilai author, title, price, dan publisherNumber
    public Books(String author, String title, double price, int publisherNumber) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisherNumber = publisherNumber;
    }

    // Getter untuk mendapatkan harga buku
    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        // Membuat beberapa objek buku
        Books book1 = new Books("Author1", "Title1", 20.0, 12345);
        Books book2 = new Books("Author2", "Title2", 25.0, 67890);
        Books book3 = new Books("Author3", "Title3", 30.0, 13579);

        // Menghitung total harga dari beberapa buku
        double totalPrice = book1.getPrice() + book2.getPrice() + book3.getPrice();

        // Menampilkan total harga
        System.out.println("Total Price for all books: $" + totalPrice);
    }
}

