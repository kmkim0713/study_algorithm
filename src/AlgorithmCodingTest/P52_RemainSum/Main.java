package AlgorithmCodingTest.P52_RemainSum;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }

        // 투포인터
        int start = 1;
        int end = 1;
        int count = 0;
        int sum = 1;

        while (end < arr.length) {

            if (sum < N) {
                end++;
                sum = sum + end;
            } else if (sum > N) {
                sum = sum - start;
                start++;
            } else if (sum == N) {
                end++;
                sum = sum + end;
                count++;
            }
        }

        System.out.println(count);

    }
}
