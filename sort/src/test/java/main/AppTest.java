package main;

import org.junit.Test;

import static org.junit.Assert.*;
public class AppTest {

    @Test
    public void test() {
        App app = new App();
        app.setString("Hello World!");

        assertEquals("Hello World!", app.getString());
    }
}