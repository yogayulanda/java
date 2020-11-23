package com.company;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        JSONObject grades=new JSONObject();
        grades.put("physics",80);
        grades.put("calculus",70);
        grades.put("biologi",85);

        JSONObject grades1=new JSONObject();
        grades.put("physics",75);
        grades.put("calculus",95);
        grades.put("biologi",65);

        JSONObject grades2=new JSONObject();
        grades.put("physics",0);
        grades.put("calculus",0);
        grades.put("biologi",0);


        JSONObject soleh=new JSONObject();
        soleh.put("fullname","Soleh Said");
        soleh.put("address","Jakarta");
        soleh.put("status","Active");
        soleh.put("grades", grades);


        JSONObject ridwan=new JSONObject();
        ridwan.put("fullname","Ridwan Jamil");
        ridwan.put("address","Bandung");
        ridwan.put("status","On Leave");
        ridwan.put("grades", grades);

        JSONObject purwoko=new JSONObject();
        purwoko.put("fullname","Ahmad Purwoko");
        purwoko.put("address","Jogja");
        purwoko.put("status","Non Active");
        purwoko.put("grades", grades);


        JSONObject obj = new JSONObject();
        obj.put("soleh", soleh);


        JSONObject obj1 = new JSONObject();
        obj1.put("ridwan", ridwan);


        JSONObject obj2 = new JSONObject();
        obj2.put("purwoko", purwoko);


        JSONArray arr = new JSONArray();
        arr.add(obj);
        arr.add(obj1);
        arr.add(obj2);

        JSONObject mahasiswa = new JSONObject();
        mahasiswa.put("mahasiswa" , arr);

        // Buat fileJson menjadi mahasiswa_yoga.txt

        try(FileWriter file = new FileWriter("mahasiswa2_yoga.json")){
            file.write(mahasiswa.toJSONString());
            file.flush();
        }

        try {
            System.out.println("MengUpload Ke FTP");
            upload();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

        public static void upload(){
        UploadToFTP uploadFTP = new UploadToFTP();
        uploadFTP.start();
    }
}
