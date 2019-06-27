package chudalewski.piotr.quicksort;

public class Main {

    public static void main(String[] args) {
        int[] sortArray = {20,35,-15,7,55,1,-22};

        quickSort(sortArray,0,sortArray.length);

        for (int i = 0; i < sortArray.length;i++) {
            System.out.println(sortArray[i]);
        }
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex +1, end);

    }

    public static int partition(int[] input, int start, int end) {

        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j];
            }

            while (i < j && input[++i] <= pivot);
            if(i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;

    }
}
