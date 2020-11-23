public class Siswa {
    String nama; // Deklarasi Variabel nama
    String gender;  // Deklarasi Variable gender
    int nilai;  // Deklarasi Variable nilai
    int umur; // Deklarasi Variable umur
    String gradeNilai;  // Deklarasi Variable untuk Menampung Grade Nilai
    int day; // Deklarasi Variable day
    int month; // Deklarasi Variable month
    int year; // Deklarasi Variable year

    // Constructors Data Mahasiswa
	public Siswa(String nama, String gender, int nilai, int day, int month,int year){
        this.nama = nama; // Inisialisasi Nilai Nama
        this.gender = gender; // Inisialisasi Nilai Gender
        this.nilai = nilai; // Inisialisasi Nilai Nilai
        this.day = day; // Inisialisasi Nilai Day
        this.month = month; // Inisialisasi Nilai Month
        this.year = year; // Inisialisasi Nilai Year
    }
    
    // Pencarian Grade Berdasarkan Nilai
    public String getGradeNilai(int nilai){
        if (nilai >= 80) {
            return gradeNilai = "A"; // Jika Nilai Besar Dari Sama Dengan 80 Maka A
            } else if (nilai >= 60) { 
                return gradeNilai = "B"; // Jika Nilai Besar Dari Sama Dengan 60 Maka B
            } else if (nilai >= 40) {
                return gradeNilai = "C"; // Jika Nilai Besar Dari Sama Dengan 40 Maka C
            } else if (nilai >= 20) {
                return gradeNilai = "D"; // Jika Nilai Besar Dari Sama Dengan 20 Maka D
            } else {
                return gradeNilai = "F"; // Selain Nilai DIatas Maka F
            }
    }

// Pencarian Umur
    public int getUmur(){ 
        return umur = 2020 - year; 
        // Mengembalikan Nilai Umur dengan Tahun Sekrang 2020 - Tahun Dari Data Siswa
    } 

// Format Tanggal
public String formatToString() {
    String changeMonthToString; // Deklarasi Local Variable changeMonthToString
    switch (month) { // Switch Case berdasarkan nilai Variabel 
        case 1:  changeMonthToString = "Januari";
                break;
        case 2:  changeMonthToString = "Februari";
                break;
        case 3:  changeMonthToString = "Maret";
                break;
        case 4:  changeMonthToString = "April";
                break;
        case 5:  changeMonthToString = "Mei";
                break;
        case 6:  changeMonthToString = "Juni";
                break;
        case 7:  changeMonthToString = "Juli";
                break;
        case 8:  changeMonthToString = "Agustus";
                break;
        case 9:  changeMonthToString = "September";
                break;
        case 10: changeMonthToString = "Oktober";
                break;
        case 11: changeMonthToString = "November";
                break;
        case 12: changeMonthToString = "Desember";
                break;
        default: changeMonthToString = "Invalid month";
                break;
    }
    // Menginisialisasi String Variable makeDateString
    String makeDateString = changeMonthToString + " " + day +", " + year;
    return makeDateString; // mengembalikan Nilai variable makeDateString
}


// Looping Umur (History Umur)
public void historyUmur(int year) {
    int count = year; // inisialisasi local variable count berdasarkan variable year
    int tahun = 0; //inisialisasi local variable tahun
    for (int i = count; i <= 2020; i++) { // Looping For 
        System.out.println("Pada tahun " + count + " berumur : " + tahun + " tahun.");
        count++; // iterasi count
        tahun++; // iterasi umur
    }
} 

//Method klasifikasi kelas berdasarkan umur
public void classAge(int umur) { // Menambahkan Parameter Umur dalam classAge
    if (umur < 8) {
        System.out.println(nama + " Anak-Anak"); // Jika Kondisi Terpenuhi maka melakukan print
    } else  if (umur < 12) {
        System.out.println( nama + " pada saat ini bersekolah di SD"); // Jika Kondisi Terpenuhi maka melakukan print
    } else  if (umur < 15) {
        System.out.println( nama + " pada saat ini bersekolah di SMP"); // Jika Kondisi Terpenuhi maka melakukan print
    } else  if (umur == 15) {
        System.out.println( nama + " pada saat ini bersekolah di tingkat kelas 1 SMA."); // Jika Kondisi Terpenuhi maka melakukan print
    } else if (umur == 16) {
        System.out.println( nama + " pada saat ini bersekolah di tingkat kelas 2 SMA."); // Jika Kondisi Terpenuhi maka melakukan print
    } else if (umur == 17) {
        System.out.println( nama + " pada saat ini bersekolah di tingkat kelas 3 SMA."); // Jika Kondisi Terpenuhi maka melakukan print
    } else if (umur == 18) {
        System.out.println( nama + " pada saat ini Kuliah Tingkat 1."); // Jika Kondisi Terpenuhi maka melakukan print
    } else if (umur == 19) {
        System.out.println( nama + " pada saat ini Kuliah Tingkat 2."); // Jika Kondisi Terpenuhi maka melakukan print
    } else if (umur == 20) {
        System.out.println( nama + " pada saat ini Kuliah Tingkat 3."); // Jika Kondisi Terpenuhi maka melakukan print
    } else if (umur == 21) {
        System.out.println( nama + " pada saat ini Kuliah Tingkat 4."); // Jika Kondisi Terpenuhi maka melakukan print
    } else if (umur == 22) {
        System.out.println( nama + " pada saat ini sudah Lulus dan sedang mencari pekerjaan."); // Jika Kondisi Terpenuhi maka melakukan print
    } else { 
        System.out.println( nama + " pada saat ini sedang bekerja."); // Jika Semua Kondisi Tidak Terpenuhi maka melakukan print
    }
}

// Print 
void printStates() {
        System.out.println("Nama : " + nama + ", Umur:  " + getUmur() +  ", Jenis Kelamin : " + gender );
        System.out.println("Tanggal Lahir : "+ formatToString());
        System.out.println("Nilai : " + nilai + ",  Grade : " + getGradeNilai(nilai) ); 
        historyUmur(year);           
        classAge(umur);       
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

