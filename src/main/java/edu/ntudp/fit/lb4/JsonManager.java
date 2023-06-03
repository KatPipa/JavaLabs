package edu.ntudp.fit.lb4;

import com.google.gson.Gson;
import edu.ntudp.fit.lb4.Model.University;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {
    public void writeToFile(Object university, String filePath) {
        Gson gson = new Gson();
        String s = gson.toJson(university);
        try {
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write(s);
            myWriter.close();
            System.out.println("Program was successfully written to the file!");
        } catch (IOException e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }

    public Object readFromFile(String filePath) {
        Gson gson = new Gson();
        try {
            return gson.fromJson(new FileReader(filePath), University.class);
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return null;
    }
}
