import ordenacao.BubbleSort;
import ordenacao.InsertionSort;
import ordenacao.MergeSort;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] A = new int[10000];
        Random r = new Random();
        int low = 10;
        int high = 10000000;
        InsertionSort is;
        MergeSort ms;
        BubbleSort bs;
        for (int i = 1; i < A.length; i++) {
            A[i] = r.nextInt(high - low) + low;
        }

        is = new InsertionSort(A.clone());
        ms = new MergeSort(A.clone());
        bs = new BubbleSort(A.clone());
        long startTime = System.currentTimeMillis();
        is.sort();
        System.out.println("Insertion sort time: " + (System.currentTimeMillis() - startTime));

        System.out.println();
        startTime = System.currentTimeMillis();
        ms.sort(0, (A.length - 1));
        System.out.println("Mergesort time: " + (System.currentTimeMillis() - startTime));

        System.out.println();
        startTime = System.currentTimeMillis();
        bs.sort();
        System.out.println("BubbleSort time: " + (System.currentTimeMillis() - startTime));
    }
}