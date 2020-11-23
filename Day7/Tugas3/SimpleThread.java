import java.io.FileInputStream;
public class SimpleThread{

    public static void printText(String nama){
        try{
            FileInputStream fin =new FileInputStream(nama);
            int i=0;
            System.out.print("Success: ");
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            System.out.println();
            Main mainTugas = new Main();
            mainTugas.showMenu();
            fin.close();
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}