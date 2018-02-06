package edu.tamu.amos.spring.firstspringproject.level1.sorting;

/*
 * Created by Amos on 2/5/18.
 */
public class BubbleSortAlgorithm implements SortAlgorithm {


    @Override
    public void sort(int[] inputArray) {
        // Bubble Sort
        if (inputArray.length > 1) {
            for (int i=1; i<inputArray.length; i++) {
                int cursor = i;
                while (cursor >= 1 && inputArray[cursor] < inputArray[cursor-1] ) {
                    swap(inputArray, cursor-1, cursor);
                    cursor --;
                }
            }
        }
    }

    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

}
