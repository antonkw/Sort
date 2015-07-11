package by.kovalevsky;

import by.kovalevsky.test.MergeSortTest;
import org.junit.runner.JUnitCore;

public class Main {

    public static void main(String[] args) {
        JUnitCore junit = new JUnitCore();
        StringBuilder finalResult = new StringBuilder("Counts of merge sort test`s fails: ");
        finalResult.append(junit.run(MergeSortTest.class).getFailureCount());
        System.out.print(finalResult);
    }
}
