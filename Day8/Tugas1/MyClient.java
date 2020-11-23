import java.net.*;  
import java.io.*;  
import java.util.Properties;

public class MyClient{  
    public static void main(String args[])throws Exception{  
        try {
        String fileConfig = args[0];
        // Config
        Properties prop = new Properties();
        // load  properties file
        prop.load(new FileInputStream(fileConfig));
        //Configure socket sesuai file properties
        Socket s = new Socket(prop.getProperty("server"),Integer.parseInt(prop.getProperty("port")));  
        System.out.println("Berhasil Terhubung : " + prop.getProperty("server") + "/" + prop.getProperty("port"));
        DataInputStream dis = new DataInputStream(s.getInputStream());  
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        
        String pesanClient ="";
        String pesanServer ="";  
        while(!pesanClient.toLowerCase().equals("exit")){  
            pesanServer = dis.readUTF();  
            System.out.println("Dari Server =:> "+pesanServer); 
            pesanClient = br.readLine();  
            dout.writeUTF(pesanClient);  
            dout.flush();   
        }  
        dout.close();  
        s.close();  
        } catch (Exception e) {
            System.out.println("Error on Chat Client: " +e);
        }
    
    }
}  