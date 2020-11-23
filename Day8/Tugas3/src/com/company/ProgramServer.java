package com.company;

import java.net.*;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;


public class ProgramServer{

    public static String config;
    public static String myfile;
    public static String fileData;
    public static Socket s;
    public static ServerSocket ss;
    public static DataOutputStream dout;
    public static DataInputStream dis;
    public static boolean isLogin = false;
    public static BufferedReader br;
    public static String strClient;

    public static void main(String args[]){

        try {
            config = args[0]; // Config Properties
            myfile = args[1]; // File Data

            // Config load a properties file
            Properties prop = new Properties();
            prop.load(new FileInputStream(config));

            br = new BufferedReader(new InputStreamReader(System.in));
            //Login
            while(isLogin != true) {
                System.out.println("Login Form");
                System.out.print("Masukan Username  : ");
                String username = br.readLine();
                System.out.print("Masukkan Password : ");
                String password = br.readLine();
                try {
                    doLogin(username, password);
                    if(isLogin) {
                        System.out.println("Menunggu terhubung ke Client");
                    } else {
                        System.out.println("Gagal Login");
                    }
                } catch (Exception e) {
                    System.out.println("Error Login : " + e);
                }
            }


            if (isLogin == true) {
                //Buat Socket
                ServerSocket ss = new ServerSocket(Integer.parseInt(prop.getProperty("port")));
                Socket s = ss.accept();
                System.out.println("Berhasil Terhubung : " + prop.getProperty("server") + "/" + prop.getProperty("port"));
                dis = new DataInputStream(s.getInputStream());
                dout = new DataOutputStream(s.getOutputStream());
                br = new BufferedReader(new FileReader(myfile));

                int i;
                while((i = br.read()) != -1) {
                    fileData += (char) i;
                }
                br.close();
                dis = new DataInputStream(s.getInputStream());
                dout = new DataOutputStream(s.getOutputStream());
                //Writing file data to Client
                dout.writeUTF(String.format(fileData));
                dout.flush();
                // Reading
                System.out.println("waiting the message ...");
                String strClient = dis.readUTF();
                System.out.println(strClient);
                //Close
                dis.close();
                dout.close();

                //Reading request from client
                strClient = dis.readUTF();
                if (strClient.toLowerCase().equals("exit")) {
                    ss.close();
                }
            } else {
                System.out.println("Gagal terhubung..");
            }

        } catch (Exception e) {
            System.out.println("Error on Main Server: " +e);
        }
    }

    // Method for Login Validation
    public static void doLogin(String username, String password) throws Exception {
        //RegEx Inisialisasi
        boolean isRegexUsername = Pattern.matches("^(.+)@(.+)$", username);
        boolean isRegexPassword = Pattern.matches("^(?=.*[0-9]).{8,}$", password);

        if(isRegexUsername == true && isRegexPassword == true) {
            if(username.toLowerCase().equals("malih@gmail.com") && password.equals("Rahasia123.")) {
                isLogin = true;
                System.out.println("Login Berhasil");
            } else {
                System.out.println("Email atau Password salah");
            }
        } else {
            System.out.println("Format salah, mohon masukkan username / password kembali lagi !!");
        }
    }


}