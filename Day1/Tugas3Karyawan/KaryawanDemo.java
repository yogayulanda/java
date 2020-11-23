class KaryawanDemo {
    public static void main(String[] args) {

// Deklarasi Karyawan
        Karyawan k1 = new Karyawan();
        Karyawan k2 = new Karyawan();
        Karyawan k3 = new Karyawan();

// Set Nilai Karyawan 1
        k1.SetNama("Yoga");
        k1.SetJabatan("Supervisor");
        k1.SetGaji(7000000);

        k1.GetNama();
        k1.GetJabatan();
        k1.GetGaji();

        k1.printStates();

// Set Nilai Karyawan 1
        k2.SetNama("Aji");
        k2.SetJabatan("Manager");
        k2.SetGaji(1000000);

        k2.GetNama();
        k2.GetJabatan();
        k2.GetGaji();
        k2.printStates();

// Set Nilai Karyawan 1
        k3.SetNama("Yulanda");
        k3.SetJabatan("Staff");
        k3.SetGaji(500000);

        k3.GetNama();
        k3.GetJabatan();
        k3.GetGaji();
    

        k3.printStates();

    }
}
