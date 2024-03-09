package BinarySearch;

import java.util.ArrayList;

public class BinarySearch01 {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(5);
        arr.add(8);
        arr.add(12);
        arr.add(18);
        arr.add(23);
        arr.add(26);
        arr.add(30);
        arr.add(33);
        arr.add(36);
        arr.add(38);
        arr.add(39);
        arr.add(40);

        int divisionIndex;
        int startIndex = 0;
        int endIndex = arr.size()-1;

        int targetNum = 26;
        int targetIndex = -1;

        while(startIndex <= endIndex){

            divisionIndex = (startIndex + endIndex)/2;

            if(targetNum == arr.get(divisionIndex)) {
                targetIndex = divisionIndex;
                break;
            }
            else if(targetNum < arr.get(divisionIndex)){
                endIndex = divisionIndex - 1;
            }
            else if(targetNum > arr.get(divisionIndex)){
                startIndex = divisionIndex + 1;
            }
        }

        if (targetIndex == -1){
            System.out.println("찾는 값이 없음");
        } else {
            System.out.println("값의 인덱스: "+targetIndex);
        }
    }

}
