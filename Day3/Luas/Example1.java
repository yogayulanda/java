public class Example1 {

    public static void main(String[] args) {
    // int jumlah = args.length;
    // int args1 = Integer.parseInt(args[0]);
    int a = 11;
    int b = 6;
    double c = 7.3;
    double d = 9.4;
    double r = 7;
    int e = 1997;

    switch(Integer.parseInt(ags[0]) {
            // jika x == 1 maka jalankan case 1
            case 1 :
                // int resultPersegi = luasBangun(args[1]);
                    System.out.println("Luas Persegi = " + resultPersegi(Integer.parseInt(args[1])));
                break; // Break 
            case 2 : // Jika case == 2 Maka jalankan case 2
                // double resultLingkaran = luasBangun(r);
                    System.out.println("Luas Lingkaran = " + resultLingkaran(Double.parseDouble(args[1])));
                break;
            case 3 : // Jika tidak ada dalam case maka jalankan default
                double resultLuasBangun = luasBangun(c,d);
                    System.out.println("Luas Bangun = " + (Double.parseDouble(args[1])));
                break;
            case 4 : // Jika tidak ada dalam case maka jalankan default
                // int resultUmur = umur(e);
                    System.out.println("Umur = " + resultUmur(Integer.parseInt(args[1])));
                break;
            default :
                    System.out.println("Wrong Argument!");
                    break;
        }
    
      // same function name with different parameters
      // double result2 = luasBangun(c, d);
    }

    //Persegi
    public static int luasBangun(int s1, int s2) {
        int luas;
        luas = s1 * s2;

    return luas; 
    }
    //for Lingkaran
        public static double luasBangun(double s1) {
            double luas;
            double phi= 3.14;
            luas = phi * (s1*s1);
            return luas; 
        }

    // For LuasBangun
        public static double luasBangun(double s1, double s2) {
            double luas;
            luas = 0.5 * s1 * s2;
            return luas; 
        }

        //umur
        // For LuasBangun
        public static int umur(int s1) {
            int year = 2020;
            int umur;
            umur = year -  s1; 
            return umur;

        }

}