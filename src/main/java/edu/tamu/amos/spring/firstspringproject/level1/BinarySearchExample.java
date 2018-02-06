package edu.tamu.amos.spring.firstspringproject.level1;

import edu.tamu.amos.spring.firstspringproject.level1.sorting.QuickSortAlgorithm;
import edu.tamu.amos.spring.firstspringproject.level1.sorting.SortAlgorithm;

/*
 * Created by Amos on 2/5/18.
 */
public class BinarySearchExample {

    SortAlgorithm sortAlgorithm;

    // Loosely-Coupled
    public BinarySearchExample(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] input, int target, SortAlgorithm InputSortAlgorithm) {
        sortAlgorithm.sort(input);
        // B-Search

        return 10;
    }

}
