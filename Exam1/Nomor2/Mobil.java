class Mobil {
    public static void main(String[] args) {
        Mobil1 mobil1 = new Mobil1();
        Mobil1 mobil2 = new Mobil1();
        // Invoke methods on 
        // those objects
        mobil1.applyMerk("Avanza");
        mobil1.applyTahun(2020);
        mobil1.applyKecepatan(0);

        mobil1.tambahKecepatan(100);
        mobil1.kurangKecepatan(50);
        mobil1.printStates();

        mobil2.applyMerk("Mercy");
        mobil2.applyTahun(2020);
        mobil2.applyKecepatan(0);

        mobil2.tambahKecepatan(100);
        mobil2.kurangKecepatan(50);
        mobil2.printStates();
    }
}

class Mobil1 {
    String merk = "Honda" ;
    int tahun = 0;
    int kecepatan = 0;

    void applyTahun(int newValue) {
        tahun = newValue;
        System.out.println("Mobil Keluaran Tahun :" + newValue);
    }

    void applyMerk(String newValue) {
        merk = newValue;
        System.out.println("Merk mobil :" + newValue);
    }

    void applyKecepatan(int newValue) {
        kecepatan = newValue;
    }

    void tambahKecepatan(int increment) {
        kecepatan = kecepatan + increment;   
    }

    void kurangKecepatan(int decrement) {
        kecepatan = kecepatan - decrement;
    }

    void printStates() {
        System.out.println(
            "Merk Mobil:" + merk + 
            "Tahun Keluaran:" + tahun + 
            "Kecepatan:" + kecepatan);
    }
}
