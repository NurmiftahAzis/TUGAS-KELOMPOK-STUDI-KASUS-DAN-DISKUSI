public class DemoAlatMusik {
    
    // Method untuk menghitung total harga
    public static int hitungTotalHarga(AlatMusik[] inventaris) {
        int total = 0;
        for (AlatMusik alat : inventaris) {
            total += alat.getHarga();
        }
        return total;
    }
    
    // Method untuk mengelompokkan jenis
    public static void kelompokkanJenis(AlatMusik[] inventaris) {
        int countGitar = 0, countDrum = 0;
        
        for (AlatMusik alat : inventaris) {
            if (alat instanceof Gitar) {
                countGitar++;
            } else if (alat instanceof Drum) {
                countDrum++;
            }
        }
        
        System.out.println("Jumlah Gitar: " + countGitar);
        System.out.println("Jumlah Drum: " + countDrum);
        System.out.println("Total Alat Musik: " + inventaris.length);
    }
    
    public static void main(String[] args) {
        System.out.println("=== DEMO SISTEM ALAT MUSIK ===\n");
        
        // Buat array inventaris
        AlatMusik[] inventaris = {
            new Gitar("Gitar Listrik", 2500000, 6),
            new Gitar("Gitar Akustik", 1500000, 6),
            new Drum("Drum Set", 5000000, 3),
            new Drum("Bass Drum", 800000, 1)
        };
        
        System.out.println("1. Info Semua Alat Musik:");
        System.out.println("======================================");
        for (AlatMusik alat : inventaris) {
            alat.getInfo(); // Method dari abstract class
        }
        
        System.out.println("\n2. Mainkan Semua Alat:");
        System.out.println("====================================");
        for (AlatMusik alat : inventaris) {
            alat.mainkan(); // Setiap alat punya cara main berbeda
        }
        
        System.out.println("\n3. Bawa Semua Alat:");
        System.out.println("==============================");
        for (AlatMusik alat : inventaris) {
            alat.bawa(); // Setiap alat punya cara bawa berbeda
        }
        
        System.out.println("\n4. METHOD KHUSUS DENGAN TYPE CHECKING:");
        System.out.println("=====================================");
        for (AlatMusik alat : inventaris) {
            System.out.println("\n--- " + alat.getNama() + " ---");
            
            if (alat instanceof Gitar) {
                Gitar gitar = (Gitar) alat;
                gitar.stem();
                System.out.println("Jumlah senar: " + gitar.getJumlahSenar());
            } else if (alat instanceof Drum) {
                Drum drum = (Drum) alat;
                drum.pukul();
                System.out.println("Jumlah pedal: " + drum.getJumlahPedal());
            }
        }
        
        System.out.println("\n5. KELOMPOKKAN JENIS:");
        System.out.println("====================================");
        kelompokkanJenis(inventaris);
        
        System.out.println("\n6. TOTAL HARGA:");
        System.out.println("=============================");
        int totalHarga = hitungTotalHarga(inventaris);
        System.out.println("Total nilai inventaris: Rp " + totalHarga);
        
        System.out.println("\n7. DETAIL SETIAP ALAT MUSIK:");
        System.out.println("===========================");
        for (int i = 0; i < inventaris.length; i++) {
            System.out.println("\n" + (i + 1) + ". " + inventaris[i].getNama());
            inventaris[i].getInfo();
            inventaris[i].mainkan();
            
            if (inventaris[i] instanceof Gitar) {
                System.out.println("Jenis: Alat Musik Petik");
            } else if (inventaris[i] instanceof Drum) {
                System.out.println("Jenis: Alat Musik Pukul");
            }
        }
    }
}