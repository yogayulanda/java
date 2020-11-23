package com.company;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SendToDB {
    JSONParser parser = new JSONParser();
    JSONObject jsonObject = (JSONObject) obj;
    String fullname = (String) jsonObject.get("fullname");
        System.out.println("name is" + fullname);
}

