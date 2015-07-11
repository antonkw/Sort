package by.kovalevsky.test;

import by.kovalevsky.sort.MergeSort;
import by.kovalevsky.sort.Sort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by antonkw on 11.07.2015.
 */
public class MergeSortTest {
    @Test
    public void test1() {
        int[] testArray = new int[]{3,2,1,4};
        Sort sort = new MergeSort();
        testArray = sort.sort(testArray);
        assertEquals(true, Arrays.equals(testArray, new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test2() {
        int[] testArray = new int[]{3,2,1,4,5,8,0};
        Sort sort = new MergeSort();
        testArray = sort.sort(testArray);
        assertEquals(true, Arrays.equals(testArray, new int[]{0, 1, 2, 3, 4, 5, 8}));
    }
}
