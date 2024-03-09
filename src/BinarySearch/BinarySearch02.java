package BinarySearch;

public class BinarySearch02 {

    public static void main(String[] args) {
        // p114

        /* 요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로 저장하고, 일치하는 요솟수를 반환하는 메서드를 작성하세요
        *  예를들어 길이가 8인 배열 {1,9,2,9,4,6,7,9} 이고 key가 9일 때 idx에 {1,3,7}을 저장하고 3을 반환
        * */

        int[] a = {1,9,2,9,4,6,7,9};
        int key = 9;

        int[] idxArr = new int[8];

        searchIdx(a, a.length, 9, idxArr);

        for(int temp: idxArr){
            System.out.println(temp);
        }

    }

    static void searchIdx(int[] a, int n, int key, int[] idxArr){

        int count = 0;
        int arrayCount = 0;

        while(count < idxArr.length){

            if (a[count] == key){
                idxArr[arrayCount++] = count;
            }
            count++;
        }
    }

}
