package org.example;

import org.junit.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestProgramm {
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void hiDog() {
        String result = "Привет дружок" + System.lineSeparator() +
                "Гав-гав" + System.lineSeparator();
        String[] value={"person"};
        org.example.Test.main(value);
        Assert.assertEquals(result, output.toString());
    }

    @Ignore
    public void hiCat() {
        String[] value={"person2"};
        String result = "Привет дружок" + System.lineSeparator() +
                "Мяу-мяу" + System.lineSeparator();
        org.example.Test.main(value);
        Assert.assertEquals(result, output.toString());
    }

    @After
    public void returnStream() {
        System.setOut(null);
    }

}
