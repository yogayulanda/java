import java.net.*;  
import java.io.*;  
import java.util.Properties;

public class MyServer{  
    public static void main(String args[])throws Exception{  
        try {
            String fileConfig = args[0];
            // Config
            Properties prop = new Properties();
            // load a properties file
            prop.load(new FileInputStream(fileConfig));
            //Buat Socket
            ServerSocket ss = new ServerSocket(Integer.parseInt(prop.getProperty("port")));  
            Socket s = ss.accept();  
            System.out.println("Berhasil Terhubung : " + prop.getProperty("server") + "/" + prop.getProperty("port"));
            DataInputStream dis = new DataInputStream(s.getInputStream());  
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());  
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
            String pesanClient="";
            String pesanServer="";

            // logic message
            while(!pesanClient.toLowerCase().equals("exit")){  
                // Write pesanServer
                pesanServer=br.readLine();  
                dout.writeUTF(pesanServer);  
                dout.flush();  
                // baca pesanClient
                pesanClient=dis.readUTF();  
                System.out.println("Dari Client =:=> "+pesanClient);  
            }  
            dis.close();  
            s.close();  
            ss.close();  
        } catch (Exception e) {
            System.out.println("Error on Chat Client: " +e);
        }
    }
}  