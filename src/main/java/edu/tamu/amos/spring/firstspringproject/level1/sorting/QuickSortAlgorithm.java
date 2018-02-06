package edu.tamu.amos.spring.firstspringproject.level1.sorting;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/*
 * Created by Amos on 2/5/18.
 */

//@Component
public class QuickSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort(int[] inputArray) {
        // QuickSort
        Arrays.sort(inputArray);
    }
}
