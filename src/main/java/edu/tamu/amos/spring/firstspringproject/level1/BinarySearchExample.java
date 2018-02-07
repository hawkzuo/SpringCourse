package edu.tamu.amos.spring.firstspringproject.level1;

import edu.tamu.amos.spring.firstspringproject.level1.basic.SortAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * Created by Amos on 2/5/18.
 */

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchExample {

    // Field injection is not recommended
//     @Autowired
    private final SortAlgorithm sortAlgorithm;

    // Loosely-Coupled
    // Constructor Injection
    @Autowired
    public BinarySearchExample(@Qualifier("quick") SortAlgorithm sortAlgorithm) {
        // SortAlgorithm: One Primary One Normal will work
        // Two same SortAlgorithm Components are not allowed.
        this.sortAlgorithm = sortAlgorithm;
    }

    // Setter Injection
//    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }


    public int binarySearch(int[] input, int target) {
        sortAlgorithm.sort(input);
        // B-Search

        return 10;
    }

}
