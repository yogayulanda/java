import java.io.FileInputStream;
import java.io.FileOutputStream;

// write
public class WriteAndRead {
    public static void main(String args[]){
            try{
                FileOutputStream fout=new FileOutputStream("./asset/"+ args[0]+".txt");
                // String s="yoga";
                //Write
                String s=args[1];
                byte b[]=s.getBytes();
                fout.write(b);
                fout.close();
                System.out.println("success...");

                // untuk read
                FileInputStream fin=new FileInputStream("./asset/"+args[0]+".txt");
                int i=0;
                while((i=fin.read())!=-1){
                System.out.print((char)i);
                }
                fin.close();
                }catch(Exception e){System.out.println(e);}
        }
    }