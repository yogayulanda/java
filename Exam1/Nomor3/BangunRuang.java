public class BangunRuang {
    public static void main(String args[]){
    int x = Integer.parseInt(args[0]);
    double a = 6;
    int panjang = 5;
    int lebar = 3;
    int tinggi = 2;
    int sisi = 5;
    double sum = volumeBangun(panjang,lebar,tinggi)+ volumeBangun(a)+ volumeBangun(sisi);
    double average = (volumeBangun(panjang,lebar,tinggi)*volumeBangun(a)*volumeBangun(sisi))/3;
        switch(x){
        case 1: System.out.println("Volume Balok   =  " + volumeBangun(panjang,lebar,tinggi));
        break;
        case 2: System.out.println("Volume Bola    =  " + volumeBangun(a));
        break;
        case 3: System.out.println("Volume Kubus    =  " + volumeBangun(sisi));
        break;
        case 4: System.out.println("Jadi Averagenya Adalah    =  " + average);
                System.out.println("Dan Summarynya Adalah = " + sum);
        break;
        default :System.out.println("Pilihan Tidak Tersedia!");
            }
        }
        // Voleume Balok
        public static int volumeBangun(int panjang, int lebar, int tinggi ) {    
        int balok = panjang* lebar * tinggi; 
        return balok;
        }
       // Volume Bola
        public static double volumeBangun(double n1) {
           return (4/3) * (3.14 * (n1 * n1 * n1));
        }
        // Volume Kubus
        public static int volumeBangun(int n1) {
            return n1 * n1 * n1 ;
        }
        // average
}
