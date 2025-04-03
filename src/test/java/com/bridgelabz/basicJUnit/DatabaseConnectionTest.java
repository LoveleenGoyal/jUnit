package com.bridgelabz.basicJUnit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class DatabaseConnectionTest {
    @BeforeEach
    void setUp() {
        DatabaseConnection.connect();
    }

    @AfterEach
    void tearDown() {
        DatabaseConnection.disconnect();
    }

    @Test
    void testConnectionEstablished() {
        assertTrue(DatabaseConnection.isConnected(), "Database should be connected");
    }

    @Test
    void testConnectionClosed() {
        DatabaseConnection.disconnect();
        assertFalse(DatabaseConnection.isConnected(), "Database should be disconnected");
    }
}
