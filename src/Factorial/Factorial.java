package Factorial;

import java.util.EmptyStackException;

public class Factorial {

    public static int recur(int num){
        if (num == 1) return num;
        return num * recur(num - 1);
    }

    public static void main(String[] args) {

        System.out.println(recur(5));
    }
}