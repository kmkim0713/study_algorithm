package AlgorithmCodingTest.P47_IntervalSumTwoDimension;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n + 1][n + 1];
        int[][] intervalSumArrX = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // intervalSumArrX[i][j]에 arr(1,1)에서 arr(i,j)까지의 숫자를 합한 값이 있다. 테트리스 하듯이 영역을 빼기 위함
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                intervalSumArrX[i][j] = intervalSumArrX[i][j-1]
                        + intervalSumArrX[i-1][j]
                        - intervalSumArrX[i-1][j-1]
                        + arr[i][j];
            }
        }

        bw.write("\n");

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                bw.write(arr[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.write("\n");


        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                bw.write(intervalSumArrX[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.write("\n");
        bw.write("-------------\n");


        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            bw.write(intervalSumArrX[c][d] - intervalSumArrX[a-1][d] - intervalSumArrX[c][b-1] + intervalSumArrX[a-1][b-1] + "\n");
        }

        bw.flush();

    }
}


