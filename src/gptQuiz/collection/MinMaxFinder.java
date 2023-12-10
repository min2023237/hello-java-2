package gptQuiz.collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

//ArrayList<Integer>를 사용하여 10개의 랜덤한 정수를 저장합니다.
//이 정수들은 1과 100 사이의 값으로 한정합니다.
//저장된 리스트에서 가장 큰 수와 가장 작은 수를 찾습니다.
//찾은 가장 큰 수와 가장 작은 수를 출력합니다.
public class MinMaxFinder {
    public static void main(String[] args) {

            List<Integer> intList = new ArrayList<>();
            Random random = new Random();

            for(int i=0; i <10; i++) {
                int randomNum = random.nextInt(100) + 1;
                intList.add(randomNum);

            }

            System.out.println("intList: "+intList);

            Integer maxNum = 0;
            Integer minNum = 100;

            for(int i=0; i<10; i++) {
                if( maxNum < intList.get(i)) {
                    maxNum = intList.get(i);
                } else if(intList.get(i) < minNum) {
                     minNum = intList.get(i);
                }
            }

//            int maxNum = intList.get(0);
//            int minNum = intList.get(0);

//            for (int number : intList) {
//                if (number > maxNum) {
//                    maxNum = number;
//                }
//                if (number < minNum) {
//                    minNum = number;
//                }
//            }


        System.out.println("최소: "+minNum +", 최대: "+maxNum);


    }
}
