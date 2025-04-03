package com.bridgelabz.basicJUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeOutTest {
    @Timeout(4)
    @Test
    public void longRunningTaskTest() throws InterruptedException {
        TimeOut.longRunningTask();
    }
}
