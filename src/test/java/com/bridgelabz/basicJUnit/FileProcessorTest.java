package com.bridgelabz.basicJUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {
    static final String FILE = "input.txt";
    String content = "Hello! How are you?";
    static FileProcessor fileProcessor;
    @BeforeAll
    public static void setUp() {
        fileProcessor = new FileProcessor();
    }
    @Test
    public void testWriteAndReadToFile() throws IOException {
        fileProcessor.writeToFile(FILE,content);
        String expected = fileProcessor.readFromFile(FILE);
        assertEquals(expected,content);
    }

    @Test
    public void testFileExistsAfterWriting() {
        File file = new File(FILE);
        assertTrue(file.exists());
    }

    @Test
    public void testReadFromNonExistentFile() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("non-exist.txt"));
    }
}
