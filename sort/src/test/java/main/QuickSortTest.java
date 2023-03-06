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

        int[] arr2 = {0, 0};
        int[] correctArr2 = {0, 0};
        QuickSort.quickSort(arr2, 0, arr2.length - 1);
        assertArrayEquals(correctArr2, arr2);

        int[] arr3 = {-1};
        int[] correctArr3 = {-1};
        QuickSort.quickSort(arr3, 0, arr3.length - 1);
        assertArrayEquals(correctArr3, arr3);

        int[] arr4 = {4,3,-2,-1};
        int[] correctArr4 = {-2, -1, 3, 4};
        QuickSort.quickSort(arr4, 0, arr4.length - 1);
        assertArrayEquals(correctArr4, arr4);
    }
}

