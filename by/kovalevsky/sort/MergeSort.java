package by.kovalevsky.sort;

/**
 * Created by antonkw on 11.07.2015.
 */
public class MergeSort implements Sort {
    @Override
    public int[] sort(int[] arrayForSort) {
        if (arrayForSort.length <= 1)   // end of recursion
            return arrayForSort;

        int[] firstHalf = new int[arrayForSort.length / 2];
        int[] secondHalf = new int[arrayForSort.length - firstHalf.length];
        System.arraycopy(arrayForSort, 0, firstHalf, 0, firstHalf.length);
        System.arraycopy(arrayForSort, firstHalf.length, secondHalf, 0, secondHalf.length);

        sort(firstHalf);
        sort(secondHalf);   //go recursion!

        merge(firstHalf, secondHalf, arrayForSort);    //and merge it
        return arrayForSort;
    }

    private void merge(int[] firstHalf, int[] secondHalf, int[] result) {
        int currentPosOfFirstHalf = 0, currentPosOfSecondHalf = 0, currentPosOfResult = 0;
        while (currentPosOfFirstHalf < firstHalf.length && currentPosOfSecondHalf < secondHalf.length) {
            if (firstHalf[currentPosOfFirstHalf] < secondHalf[currentPosOfSecondHalf]) {
                result[currentPosOfResult] = firstHalf[currentPosOfFirstHalf];
                ++currentPosOfFirstHalf;
            } else {
                result[currentPosOfResult] = secondHalf[currentPosOfSecondHalf];
                ++currentPosOfSecondHalf;
            }
            ++currentPosOfResult;
        }
        while (currentPosOfFirstHalf != firstHalf.length) {    //yes, i wanna copy it myself
            result[currentPosOfResult] = firstHalf[currentPosOfFirstHalf];
            ++currentPosOfFirstHalf;
            ++currentPosOfResult;
        }
        while (currentPosOfSecondHalf != secondHalf.length) {    //and one more time
            result[currentPosOfResult] = secondHalf[currentPosOfSecondHalf];
            ++currentPosOfSecondHalf;
            ++currentPosOfResult;
        }
    }
}
