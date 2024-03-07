import java.util.Scanner;

public class Hanoi {


    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(n);

    }


    /**
     * hanoi(N)
     *
     * 작업은 크게 3단계로 구성
     * 1단계: N-1개의 원판을 1번에서 2번 막대로 옮긴다. 출발막대:1 도착막대:2
     * 2단계: 하나 남은 N번째 원판을 3번 막대로 옮긴다 (출력)
     * 3단계: N-1개의 원판을 2번에서 3번으로 옮긴다. 출발막대:2 도착막대:3
     *
     * **/
    public static void hanoi(int n, int start, int end, int mid){

        if(n == 1){
            System.out.println(start + " " + end);

        }




    }

}