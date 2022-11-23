package j10_배열;

import java.util.Random;

public class Array3 {

    public static int foundMinNumber(int[] numbers) {
        int min = numbers[0];   // 0 이 대입되지 않게 numbers[0] 을 대입해둔다
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int foundMaxNumber(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        return max;
    }


    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;

        int[] randomArray = new int[10];

        // 배열에 랜덤 값 대입 (중복숫자 제거 1번째 방법!)
        for (int i = 0; i < randomArray.length; i++) {          // i인덱스
            while (true) {
                int randomNumber = random.nextInt(10) + 1;
                boolean found = true;
                for (int j = 0; j < randomArray.length; j++) {  // j인덱스
                    if (randomArray[j] == randomNumber) {       // 들어있는값과 새로운값과 같은게 있으면 false
                        found = false;
                        break;
                    }
                }
                if (found) {        // true일때 randomNumber에 값을 담는다
                    randomArray[i] = randomNumber;
                    break;  // while의 break
                }
            }
        }
        // 1. 배열에서 값을 하나씩 꺼내 sum으로 합한다
        // 2. 배열의 값을 하나씩 꺼내 출력! (단 length(길이)보다 -1 작을 땐 쉼표(,)를 출력하지 않는다)

        for (int i = 0; i < randomArray.length; i++) {
            sum += randomArray[i];
            System.out.print(randomArray[i]);
            if (i != randomArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("총합 : " + sum);

        System.out.println("최소값 : " + foundMinNumber(randomArray));
        System.out.println("최대값 : " + foundMaxNumber(randomArray));


    }
}
//        for (int i = 0; i < 10; i++) {
//            randomArray[i] = random.nextInt(10) + 1;
//            if(i != randomArray.length -1) {
//                System.out.print(randomArray[i] + ", ");
//            }
//            sum += randomArray[i];
//        }
//        System.out.println("총합 : " + sum);


         /*
            randomArray 배열 변수선언 및 생성(10개)
            1, 5, 3, 9, 5, ... 출력하기
            총합 구하기
         */
//    }
//}
