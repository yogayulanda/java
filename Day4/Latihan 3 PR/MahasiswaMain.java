import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MahasiswaMain {
    public static ArrayList<Mahasiswa> dataMahasiswa=new ArrayList<Mahasiswa>(); //ArrayList Mahasiswa
    public static ArrayList<String> dataId=new ArrayList<>(); // Array List ID
    public static void main(String[] args) {
        showMenu(); // Fungsi ShowMenu
        InputStreamReader r=new InputStreamReader(System.in); // fungsi input
        BufferedReader br=new BufferedReader(r); // fungsi read
        String menu="";  // deklarasi variabel menu untuk case
        try {
            while (!menu.equals("6")){
                System.out.println("Silakan Pilih Menu: ");
                menu=br.readLine(); // nilai variabel menu diisi berdasarkan nilai line yang diinput
                switch (menu){ //switch menu
                    case "1":
                        System.out.println("Menu Tambah Mahasiswa"); // print judul menu yang dipilih
                        menu1(); // Jalankan fungsi menu 1 yaitu tambah mahasiswa
                        break;
                    case "2":
                        System.out.println("Anda Memilih Menu Edit Mahasiswa");
                        menu2(); // jalankan fungsi menu 2 yaitu edit mahasiswa
                        break;
                    case "3":
                        System.out.println("Anda Memilih Menu Hapus Mahasiswa");
                        menu3(); //jalankan fungsi menu 3 yaitu hapus mahasiswa
                        break;
                    case "4":
                        menu4(); // jalankan fungsi menu 4 yaitu tampilkan semua data mahasiswa
                        System.out.println("Menampilkan Data Mahasiswa ");
                        break;
                    case "5":
                        menu5();
                        System.out.println("Laporan Berhasil Tersimpan");
                        break;
                }
            }
        } catch (Exception e){
            System.out.println("Error: "+e);
        }
        
    }

    // Function 
    private static void showMenu(){
        System.out.println("Silahkan Pilih Menu");
        System.out.println("1. Buat Object Mahasiswa");
        System.out.println("2. Edit Data Mahasiswa");
        System.out.println("3. Remove Object Mahasiswa");
        System.out.println("4. Laporan Data Mahasiswa");
        System.out.println("5. Export Laporan");
        System.out.println("6. Exit");
    }

    private static void menu1(){
        String id="";
        String nama="";
        String nilai="";
        try {
            InputStreamReader r=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(r);
            System.out.println("Silahkan Masukan Id: ");
            id=br.readLine();
            int length=dataMahasiswa.size();
//            if (length!=0){
                for (int i=0;i<dataMahasiswa.size();i++){
                    if (dataMahasiswa.get(i).getId()==Integer.parseInt(id)){
                        System.out.println("ID sudah Terdaftar");
                        System.out.println("Silahkan Masukan Id lain: ");
                        id=br.readLine();
                    }
                }
//            }

            System.out.println("Silahkan Masukan Nama: ");
            nama=br.readLine();
            System.out.println("Silahkan Masukan Nilai: ");
            nilai=br.readLine();
            Mahasiswa mhs = new Mahasiswa();
            mhs.setId(Integer.parseInt(id));
            mhs.setNama(nama);
            mhs.setNilai(Integer.parseInt(nilai));

            dataMahasiswa.add(mhs);
            System.out.println("Success data Berhasil Ditambah!!");
            showMenu();
        } catch (Exception e){
            System.out.println("Error Menu 1: "+e);
            showMenu();
        }
    }


// Menu 2
    private static void menu2(){
        String id="";
        String nama="";
        String nilai="";
//        int idx=0;
        try{
            InputStreamReader r=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(r);
            System.out.println("Silahkan Masukan Id Mahasiswa: ");
            id=br.readLine();
            for (int i=0;i<dataMahasiswa.size();i++){
//                System.out.println("Index "+i);
                if (dataMahasiswa.get(i).getId()==Integer.parseInt(id)){
                    System.out.println("Nama : "+dataMahasiswa.get(i).getNama());
                    System.out.println("Nilai : "+dataMahasiswa.get(i).getNilai());
                    System.out.println();
                    System.out.println("Masukan Nama: ");
                    nama=br.readLine();
                    System.out.println("Masukan Nilai: ");
                    nilai=br.readLine();
                    Mahasiswa mhs = new Mahasiswa();
                    mhs.setId(Integer.parseInt(id));
                    mhs.setNama(nama);
                    mhs.setNilai(Integer.parseInt(nilai));
                    dataMahasiswa.set(i,mhs);
                    System.out.println("data Berhasil Diedit!!!");
                    showMenu();
                }
            }
        } catch (Exception e){
            System.out.println("error Menu 2: "+e);
        }
    }

// Menu 3
    private static void menu3(){
        String id="";
        try{
            InputStreamReader r=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(r);
            System.out.println("Silahkan Masukan Id Mahasiswa: ");
            id=br.readLine();
            for (int i=0;i<dataMahasiswa.size();i++){
//                System.out.println("Index "+i);
                if (dataMahasiswa.get(i).getId()==Integer.parseInt(id)){
                    dataMahasiswa.remove(i);
                    System.out.println("data Berhasil Dihapus!!!");
                    showMenu();
                }
            }

        } catch (Exception e){
            System.out.println("Error Menu 3: "+e);
        }
    }

// Menu 4
    public static void bubbleSort(ArrayList<Mahasiswa> list)
    {
        for (int i = 0; i < list.size(); i++)
            for (int j = 0; j < list.size() - 1; j++)
            {
                if (list.get(j).compareTo(list.get(j + 1)) > 0)
                {
                    Collections.swap(list, j, j + 1);
                }
            }
    }

    private static void menu4(){
        bubbleSort(dataMahasiswa);
        try {
            int i=1;
            for (Mahasiswa obj: dataMahasiswa) {
                System.out.println("No : "+i+"\nID : "+obj.getId()+"\nNama : "+obj.getNama()+"\nNilai : "+obj.getNilai()+"\n\n");
                i++;
            }
            showMenu();
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
    private static void menu5(){
        try {
            FileWriter writer=new FileWriter("Mahasiswa.txt");
            BufferedWriter buffer = new BufferedWriter(writer);
            for (Mahasiswa obj: dataMahasiswa) {
                buffer.write("ID : "+obj.getId()+"\nNama : "+obj.getNama()+"\nNilai : "+obj.getNilai()+"\n\n");
            }
            buffer.close();
            System.out.println("Sukses!!");
            showMenu();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
