package edu.tamu.amos.spring.firstspringproject.level1;

import edu.tamu.amos.spring.firstspringproject.level1.sorting.QuickSortAlgorithm;
import edu.tamu.amos.spring.firstspringproject.level1.sorting.SortAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * Created by Amos on 2/5/18.
 */

@Component
public class BinarySearchExample {

    // Field injection is not recommended
//    @Autowired
    private final SortAlgorithm sortAlgorithm;

    // Loosely-Coupled
    @Autowired
    public BinarySearchExample(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] input, int target) {
        sortAlgorithm.sort(input);
        // B-Search

        return 10;
    }

}
