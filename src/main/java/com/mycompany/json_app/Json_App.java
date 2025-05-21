
package com.mycompany.json_app;

import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class Json_App {

    public static void main(String[] args) {
    JSONObject person = new JSONObject();
    person.put("name", "Jake");
    person.put("age", 23);
    person.put("isStudent", false);
    
    String prettyJson = person.toString(4);
    
    String fileName = "person.json";
    try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(prettyJson);
            fileWriter.flush(); // optional but good practice
            System.out.println("Successfully wrote pretty JSON to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing JSON file: " + e.getMessage());
        }
        
    }
}
