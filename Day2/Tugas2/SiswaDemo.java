class SiswaDemo {
        public static void main(String[] args) {
        // Input Nilai Objek
        Siswa s1 = new Siswa("Adi","Laki-Laki",80,5,5,2003);        
        Siswa s2 = new Siswa("Bambang","Laki-Laki",61,20,11,2002);
        Siswa s3 = new Siswa("Rini","Perempuan",39,9,5,1997);
        Siswa s4 = new Siswa("Rizal","Laki-Laki",19,31,7,2016);
        
        // Invoke methods on Object
        s1.printStates();
        s2.printStates();
        s3.printStates();
        s4.printStates();

        }
}
