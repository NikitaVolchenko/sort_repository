package main;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class QuickSortTest {
    @Test
    public void test() {
        int[] arr = {4, 5, 6, 1, -2, 5};
        int[] correctArr = {-2, 1, 4, 5, 5, 6};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(correctArr, arr);
    }
}

