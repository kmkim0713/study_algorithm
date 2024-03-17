package AlgorithmCodingTest.P35_SumNumbers;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        int sum = 0;
        int N;

        while (true)
        {
            N = Integer.parseInt(br.readLine());
            str = br.readLine();
            if(str.length() != N){
                bw.write("재입력해주세요\n");
                bw.flush();
            } else if (str.length() == N){
                break;
            }
        }

        for(int i = 0; i < N; i++){
            int temp = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum+=temp;
        }

        bw.write(sum+""); // bw는 기본적으로 정수값을 넣을 경우 ascii 타입으로 인코딩
        bw.flush();
    }
}
