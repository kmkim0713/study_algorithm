import java.util.Scanner;

public class HanoiSample {


    private static int n;
    private static int count;
    private static StringBuilder sb;

    public static void main(String[] args) {
        initVar();
        hanoi(n, 1, 3, 2);
        System.out.println(count);
        System.out.print(sb);
    }

    private static void initVar() {
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        count = 0;
        sb = new StringBuilder();
    }

    public static void hanoi(int number, int start, int end, int other) {
        count++;

        if(number == 1)
            sb.append(start + " " + end + "\n");
        else {
            hanoi(number - 1, start, other, end);
            sb.append(start + " " + end + "\n");
            hanoi(number - 1, other, end, start);
        }
    }
}