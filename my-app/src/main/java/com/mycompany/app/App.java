package com.mycompany.app;
import java.io.Reader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import com.google.gson.*;
/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Gson gson = new Gson();
        // try {
        //     String object = gson.fromJson(new FileReader("new.json"), String.class);
        //     System.out.println(object);
        // } catch(Exception E) {
        //     System.out.println("File not found");
        // }
        try (Reader reader = new FileReader("new.json")) {

            // Convert JSON File to Java Object
            neww staff = gson.fromJson(reader, neww.class);

			// print staff
            System.out.println(staff);
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
