import sorting.BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        BubbleSort sort =new BubbleSort();
        sort.bubbleSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\n");
        }
    }
}