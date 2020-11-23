import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class DescendingSort {
private static ArrayList<Integer> listData=new ArrayList<>();
public static void sortDsc(String fileName){
    try{
        FileInputStream fin =new FileInputStream(fileName);
        int i=0;
        System.out.print("Success: ");
        int j=0;
        String a="";
        while ((i = fin.read()) != -1) {
            j += 1;
            if ((char) i != ',') {
                a=a+(char)i;

            } else {
                int k=Integer.parseInt(a);
                listData.add(k);
                a="";
            }
        }
        System.out.println();
        Integer[] arrtemp=listData.toArray(new Integer[0]);
        System.out.println("Hasil Sorting");
        Integer[] arrSort=bubleSort(arrtemp);
        for (Integer obj : arrSort)
            System.out.println(obj);
        FileWriter fw = new FileWriter("sortDsc.txt");
        fw.write("Hasil Sort Descending:"+"\n");
        for (int k=0;k<arrSort.length;k++){
            fw.write(arrSort[k]+","+"\n");
            System.out.println(arrSort[k]);
        }
        fw.close();
        fin.close();


        Main mainTugas = new Main();
        mainTugas.showMenu();

    }
    catch(Exception e){
        System.out.println("Error: "+e);
    }
}
    private static Integer[] bubleSort(Integer[] a){
        for (int i = 0; i < ( a.length - 1 ); i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
}
