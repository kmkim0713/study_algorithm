package AlgorithmCodingTest.NumberSort2750;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        quickSort(arr, 0, arr.length - 1);

        for (int temp : arr) {
            System.out.print(temp + " ");
        }

    }

    public static void quickSort(int[] arr, int start, int end) {

        if (start >= end) return;

        int i = start;
        int j = end;

        int pivot = start;
        int pivotValue = arr[pivot];

        while (i <= j) {

            while (i <= end && pivotValue >= arr[i]) i++;

            while (j > start && pivotValue <= arr[j]) j--;

            if (i > j) {
                swap(arr, pivot, j);
            } else {
                swap(arr, i, j);
            }
        }

        quickSort(arr, start, j - 1);
        quickSort(arr, j + 1, end);

    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
