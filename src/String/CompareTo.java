package String;

import java.io.IOException;

public class CompareTo {
    // 힙 정렬

    public static void main(String[] args) throws IOException {


        String str01 = "aaa";
        String str02 = "bbb";
        String str03 = "김";
        String str04 = "김a";

        System.out.println(str01.compareTo(str02));
        System.out.println(str02.compareTo(str03));
        System.out.println(str02.compareTo(str03));
    }

}