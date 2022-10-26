import ordenacao.BubbleSort;
import ordenacao.InsertionSort;
import ordenacao.MergeSort;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] A = new int[10000];
        int[] AInvertido = new int[10000];
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
        long timeIs = 0;
        long timeMs = 0;
        long timeBs = 0;
        long startTime = System.currentTimeMillis();
        is.sort();
        timeIs = (System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        ms.sort(0, (A.length - 1));
        timeMs += (System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        bs.sort();
        timeBs += (System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        is.sort();
        timeIs += (System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        ms.sort(0, (A.length - 1));
        timeMs += (System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        bs.sort();
        timeBs += (System.currentTimeMillis() - startTime);

        A = is.returnSort();

        for (int i = 0; i < 10000; i++){
            AInvertido[9999 - i] = A[i];
        }

        is = new InsertionSort(AInvertido.clone());
        ms = new MergeSort(AInvertido.clone());
        bs = new BubbleSort(AInvertido.clone());

        System.out.println();
        startTime = System.currentTimeMillis();
        is.sort();
        timeIs += (System.currentTimeMillis() - startTime);
        System.out.println("Insertion sort time: " + timeIs);

        System.out.println();
        startTime = System.currentTimeMillis();
        ms.sort(0, (A.length - 1));
        timeMs += (System.currentTimeMillis() - startTime);
        System.out.println("Mergesort time: " + timeMs);

        System.out.println();
        startTime = System.currentTimeMillis();
        bs.sort();
        timeBs += (System.currentTimeMillis() - startTime);
        System.out.println("BubbleSort time: " + timeBs);
    }
}