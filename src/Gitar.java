public class Gitar extends AlatMusik {
    private int jumlahSenar;
    
    public Gitar(String nama, int harga, int jumlahSenar) {
        super(nama, harga);
        this.jumlahSenar = jumlahSenar;
    }
    
    @Override
    public void mainkan() {
        System.out.println(nama + " dimainkan dengan dipetik");
        System.out.println("Bunyi: jreng jreng jreng...");
    }
    
    @Override
    public void bawa() {
        System.out.println("Membawa gitar dalam case khusus");
    }
    
    public void stem() {
        System.out.println("Menyetem " + jumlahSenar + " senar gitar...");
    }
    
    // Getter
    public int getJumlahSenar() {
        return jumlahSenar;
    }
}