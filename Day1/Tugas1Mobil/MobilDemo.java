class MobilDemo {
    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil();
        // Invoke methods on 
        // those objects
        mobil1.applyMerk("Avanza");
        mobil1.applyWarna("Hitam");
        mobil1.applyGigi(3);

        mobil1.tambahGigi(4);
        mobil1.printStates();

        mobil2.applyMerk("Mercy");
        mobil2.applyWarna("Putih");
        mobil2.applyGigi(3);

        mobil2.tambahGigi(1);
        mobil2.printStates();


    }
}
