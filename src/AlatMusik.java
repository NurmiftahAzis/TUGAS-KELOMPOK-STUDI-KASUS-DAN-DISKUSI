public abstract class AlatMusik implements BisaDiBawa {
    protected String nama;
    protected int harga;
    
    public AlatMusik(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    // Abstract method - wajib diimplementasi subclass
    public abstract void mainkan();
    
    // Concrete method
    public void getInfo() {
        System.out.println("Nama: " + nama + " | Harga: Rp " + harga);
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getHarga() {
        return harga;
    }
}