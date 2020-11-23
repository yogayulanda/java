import java.util.*;
import java.io.*;

public class ShowData extends Thread {

    ArrayList<Mahasiswa> mhs;

    public ShowData(ArrayList<Mahasiswa> x) {
        mhs = x;
    }

    public void run() {
       bubbleSort(dataMahasiswa);
        try {
            int i=1;
            String leftAlignFormat = "| %-4d | %-4d | %-15s | %-6.02f | %-10.02f | %-10.02f |%n"; //Inisialisasi Format Table
            System.out.format("+------------------------------------------------------------------+%n");
            System.out.format("| No   | Id   | Nama            | Fisika | B.Inggris  | Algoritma  |%n");
            System.out.format("+------------------------------------------------------------------+%n");
            for (Mahasiswa obj: dataMahasiswa) { //Looping Data Mahasiswa
                System.out.format(leftAlignFormat, i , obj.getId(),obj.getNama(),obj.getNilai().get(0),obj.getNilai().get(1),obj.getNilai().get(2));
                i++;
            }
            System.out.format("+-------------------------------------------------------------------+%n");
            showMenu();
        } catch (Exception e) {
            System.out.println(e);
        } 
}