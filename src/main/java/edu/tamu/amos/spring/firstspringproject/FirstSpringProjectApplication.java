package edu.tamu.amos.spring.firstspringproject;

import edu.tamu.amos.spring.firstspringproject.level1.BinarySearchExample;
import edu.tamu.amos.spring.firstspringproject.level1.sorting.BubbleSortAlgorithm;
import edu.tamu.amos.spring.firstspringproject.level1.sorting.QuickSortAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {

		// Easily deal with different types of SortingAlgorithms
		BinarySearchExample instanceClassExample = new BinarySearchExample(new QuickSortAlgorithm());

		// Two 'new' usages just for creating the Instance
		// What if the instances can be pre-determined so that those codes are not needed
		// Spring helps with introducing "beans"
		BinarySearchExample instanceClassExample2 = new BinarySearchExample(new BubbleSortAlgorithm());

		int dummyResult = instanceClassExample.binarySearch(new int[] {5,4,3,2,1}, 3, null);

		System.out.println(dummyResult);
//		SpringApplication.run(FirstSpringProjectApplication.class, args);
	}
}
