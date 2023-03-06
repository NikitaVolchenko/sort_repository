package main;

import graphics.Info;

import java.io.*;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//"C:\\univer\\inginer\\sort\\t.txt"
public class Main {
    public static void main(String[] args) {
        try(Reader in = new FileReader("C:\\univer\\inginer\\sort\\t.txt")) {
            int value = in.read();
            while (value != -1) {
                System.out.print((char)value);
                value = in.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
