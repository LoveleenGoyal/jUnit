package com.bridgelabz.basicJUnit;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProcessor {
    public void writeToFile(String filename, String content) {
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readFromFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        try (FileReader fr = new FileReader(filename)){
            int ch;
            while ((ch = fr.read()) != -1) {
                content.append((char) ch);
            }
        } catch (IOException e) {
            throw new IOException(e);
        }
        return content.toString();
    }
    
}
