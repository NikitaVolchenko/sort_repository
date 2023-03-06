package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = null;
        try (BufferedReader in = new BufferedReader(new FileReader("C:\\univer\\sort\\sort_repository\\data\\test.txt")))
        {
            array = in.lines().mapToInt(Integer::parseInt).toArray();
        }
        catch (IOException | NumberFormatException e)
        {
            e.printStackTrace();
        }
        for(int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
