public class Array {

    public static void main(String[] args) {

    switch(Integer.parseInt(args[0])) {
            case 1 :
                    System.out.println("Volume Kubus : " + volume(Integer.parseInt(args[1])));
                break;
            case 2 :
                    System.out.println("Volume Bola = " + volume(Double.parseDouble(args[1])));
                break;
            case "3":
                printArray(Integer.parseInt(args[1]));
                break;
            default :
                    System.out.println("Wrong Argument!");
                    break;
        }
    }

    //Valome Kubus
        public static int volume(int s1) {
            return s1 * s1 * s1; 
        }

    //for Lingkaran
        public static double volume(double s1) {
            double luas;
            double phi= 3.14;
            luas = (4/3 * (phi * (s1*s1)));
            return luas; 
        }

public static void printArray(int a) {
        switch (a) {
            case 2: 
                String[][] arr = {{"satu","dua" , "tiga", "empat"},{ "lima", "enam"}};
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        System.out.println(arr[i][j]);
                    }
                }
                break;
            case 3:
                String[][] arr2 = {{ "satu","dua" , "tiga", "empat", "lima", "enam" },{  "tujuh", "delapan","sembilan" }};
                for (int i = 0; i < arr2.length; i++) {
                    for (int j = 0; j < arr2[i].length; j++) {
                        System.out.println(arr2[i][j]);
                    }
                }
                break;      
            default:
                break;
        }
        
    }
}