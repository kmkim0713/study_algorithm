package Hanoi;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Hanoi {

    static BigInteger count = new BigInteger("2");
    static StringBuilder sb = new StringBuilder(); // 맨 처음에 count값 출력을 위해 사용

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        count = count.pow(n).subtract(BigInteger.ONE);

        if (n <= 20){
            hanoi(n, 1, 3, 2);
            bw.write(count+"\n");
            bw.write(sb.toString());
        }else {
            bw.write(count+"\n");
        }
        bw.flush();
        bw.close();

    }


    public static void hanoi(int n, int start, int end, int mid) {

        if (n == 1) {
            sb.append(start + " " + end + "\n");
        } else {
            hanoi(n - 1, start, mid, end);
            sb.append(start + " " + end + "\n");
            hanoi(n - 1, mid, end, start);
        }
    }

}