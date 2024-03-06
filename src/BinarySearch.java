import java.util.ArrayList;

public class BinarySearch {

    public static void main(String[] args) {

        int input = 100;

        // input까지의 숫자중 작은 소수 모두 나열

        ArrayList<Integer> result = new ArrayList<>();

        for (int i=2; i<=input; i++){
            if (i % 2 != 0 && i % 3 != 0){
                result.add(i);
                System.out.println(i+"");
            }
        }



    }


}
