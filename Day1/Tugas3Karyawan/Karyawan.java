class Karyawan {

// Deklarasi Variabel
    String Nama = "";
    String Jabatan = "";
    int Gaji = 1;

// Function Nilai Nama
    void SetNama(String newNama) {
        Nama = newNama;
    }

// Mengembalikan nilai nama
    String GetNama() {
        return Nama;
    }

// Function Jabatan
    void SetJabatan(String newJabatan) {
        Jabatan = newJabatan;
    }

// Mengembalikan nilai Jabaatan
    String GetJabatan() {
        return Jabatan;
    }

// Function Gaji
    void SetGaji(int newGaji) {
        Gaji = newGaji;
    }

// Mengembalikan Nilai Gaji
    int GetGaji() {
        return Gaji;
    }


// Function Output 
    void printStates() {
    System.out.println("Data Nama Karyawan"+"\n"+" Nama Karyawan :" + Nama + "\n" +" Jabatan :"+ 
    Jabatan +"\n"+" Gaji :" + Gaji+ "\n" + "------------------");
    }
}
