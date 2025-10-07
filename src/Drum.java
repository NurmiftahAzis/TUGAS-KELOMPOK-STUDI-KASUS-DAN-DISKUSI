public class Drum extends AlatMusik {
    private int jumlahPedal;
    
    public Drum(String nama, int harga, int jumlahPedal) {
        super(nama, harga);
        this.jumlahPedal = jumlahPedal;
    }
    
    @Override
    public void mainkan() {
        System.out.println(nama + " dimainkan dengan dipukul");
        System.out.println("Bunyi: dug dug brak...");
    }
    
    @Override
    public void bawa() {
        System.out.println("Membawa drum bagian per bagian");
    }
    
    public void pukul() {
        System.out.println("Memukul drum dengan " + jumlahPedal + " pedal");
    }
    
    // Getter
    public int getJumlahPedal() {
        return jumlahPedal;
    }
}