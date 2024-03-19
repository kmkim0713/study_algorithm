package AlgorithmCodingTest.P44_IntervalSum;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        // 구간의 합의 구간합 배열로!

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[M];
        int[] intervalSumArr = new int[M];

        int arrCount = 0;

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            arr[arrCount] = Integer.parseInt(st.nextToken());

            if (arrCount == 0) {
                intervalSumArr[arrCount] = arr[arrCount];
            } else {
                intervalSumArr[arrCount] += arr[arrCount] + intervalSumArr[arrCount - 1];
            }
            arrCount++;
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken());
            int sum = intervalSumArr[b] - intervalSumArr[a - 1];
            bw.write(sum+"");
        }
        bw.flush();
    }
}
