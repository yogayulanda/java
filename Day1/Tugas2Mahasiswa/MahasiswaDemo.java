class MahasiswaDemo {
    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();

        // Invoke methods on 
        // those objects
        mhs1.SetNama("Yoga");
        mhs1.SetJK("Laki-Laki");
        mhs1.SetUmur(21);

        mhs1.GetNama();
        mhs1.GetJK();
        mhs1.GetUmur();

        mhs1.printStates();


        mhs2.SetNama("Yulanda");
        mhs2.SetJK("Wanita");
        mhs2.SetUmur(23);

        mhs2.GetNama();
        mhs2.GetJK();
        mhs2.GetUmur();

        mhs2.printStates();

    }
}
