SISTEM ALAT MUSIK

Deskripsi Tugas Kelompok

Program Java sederhana yang mendemonstrasikan 4 konsep Object-Oriented Programming (OOP) menggunakan sistem manajemen alat musik.

Konsep OOP yang Diimplementasikan
1. INHERITANCE (Pewarisan)
- Kelas Abstract: AlatMusik sebagai parent class
- Subclass: Gitar dan Drum mewarisi dari AlatMusik
- Atribut yang Diwarisi: nama, harga
- Method yang Diwarisi: getInfo(), getNama(), getHarga()

3. POLYMORPHISM (Banyak Bentuk)
- Method Overriding: mainkan() dan bawa() diimplementasi berbeda di setiap subclass
- Array Polymorphism: Array AlatMusik[] dapat menampung berbagai subclass
- Runtime Polymorphism: Pemanggilan method disesuaikan dengan tipe objek sebenarnya

4. INTERFACE
- Interface: BisaDiBawa mendefinisikan kontrak method bawa()
- Implementasi: Class AlatMusik mengimplementasi interface, subclass wajib override method bawa()

5. ARRAY
- Array of Objects: AlatMusik[] inventaris menyimpan kumpulan alat musik
- Type Checking: Menggunakan instanceof untuk mengakses method khusus
- Array Operations: Looping, filtering, dan perhitungan pada array

Alur Program:
1. Inisialisasi Array - Membuat array berisi berbagai alat musik
2. Demonstrasi Inheritance - Menampilkan informasi menggunakan method warisan
3. Demonstrasi Polymorphism - Memainkan alat musik dengan behavior berbeda
4. Demonstrasi Interface - Menunjukkan cara membawa yang berbeda
5. Operasi Array - Type checking dan perhitungan statistik

Hasil Demonstrasi
Program berhasil menunjukkan:
- Code Reusability melalui inheritance
- Flexibility melalui polymorphism
- Contract Enforcement melalui interface
- Data Management melalui array operations
