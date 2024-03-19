package AlgorithmCodingTest.P38_Average;

import java.io.*;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        DecimalFormat df = new DecimalFormat("#.#######");

        int N = Integer.parseInt(br.readLine()); // 시험을 본 과목수
        double[] arr = new double[N];
        double max = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            double temp = Double.parseDouble(st.nextToken());
            arr[i] = temp;
            if (max == 0) {
                max = temp;
            } else if (max < temp) {
                max = temp;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            double temp = arr[i] * 1.0 / max * 100;
            arr[i] = temp;
        }

        double total = 0;
        for (int i = 0; i < arr.length; i++){
            total = total + arr[i];
        }

        double avg = total/N;
        String result = df.format(avg);

        bw.write(result+"");
        bw.flush();

    }
}

