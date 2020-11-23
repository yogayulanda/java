public abstract class Worker implements Comparable{
    int id;
    String nama;
    int absensi;
    String jabatan;
    // Jadiin Abstract claass
    public abstract void setId(int id);
    public abstract int getId();
    public abstract void setNama(String nama);
    public abstract String getNama();
    public abstract void setJabatan(String jabatan);
    public abstract String getJabatan();
    public abstract void setAbsensi(int absensi);
    public abstract int getAbsensi();
    public abstract void tambahAbsensi(int id);

    @Override
    public abstract int compareTo(Object o); 
}