package sorting;

public class BubbleSort {
    public void bubbleSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length; i++) {
            for (int j = 0; j < sortArr.length - i- 1; j++) {
                if (sortArr[j] > sortArr[j + 1]) {
                    int swap;
                    swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }
}
