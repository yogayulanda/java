class Mobil {
    String merk = "Honda" ;
    String warna = "Hitam";
    int gigi = 0;
    int kecepatan = 0;

    void applyWarna(String newValue) {
        warna = newValue;
        System.out.println("Warna mobil :" + newValue);
    }

    void applyMerk(String newValue) {
        merk = newValue;
        System.out.println("Merk mobil :" + newValue);
    }

    void applyGigi(int newValue) {
        gigi = newValue;
    }

    void tambahGigi(int increment) {
        gigi = gigi + increment;   
    }

    void kurangGigi(int decrement) {
        gigi = gigi - decrement;
    }

    void printStates() {
        System.out.println(
            "Merk:" +
            merk + " gigi:" + 
            gigi + " warna:" + warna);
    }
}
