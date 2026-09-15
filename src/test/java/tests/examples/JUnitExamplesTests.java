package tests.examples;

import org.junit.jupiter.api.*;

public class JUnitExamplesTests {

    @BeforeAll
    static void startup() {
        System.out.println("tests startup");
    }

    @AfterAll
    static void teardown() {
        System.out.println("tests ended");
    }

    @BeforeEach
    void startBrowser() {
        System.out.println("Browser has started");
    }

    @AfterEach
    void stopBrowser() {
        System.out.println("Browser has stopped");
    }

    @Test
    void firstTest(){
       System.out.println("First Test");
    }

    @Test
    void secondTest(){
        System.out.println("Second Test");
    }
}
