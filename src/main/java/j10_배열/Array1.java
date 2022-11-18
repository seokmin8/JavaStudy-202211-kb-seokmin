package j10_배열;

import j01_출력.SystemOut;

public class Array1 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
//   자료형(int와는 다름!) 변수(arr1) = new(생성, 동적메모리 할당) int[n] (int형의 인스턴스 n개)

        arr1[0] = 10;
        arr1[1] = 9;
        arr1[2] = 8;
        arr1[3] = 7;
        arr1[4] = 6;
        arr1[5] = 5;
        arr1[6] = 4;
        arr1[7] = 3;
        arr1[8] = 2;
        arr1[9] = 1;

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[3]);
        System.out.println(arr1[5]);
        System.out.println(arr1[7]);

        for(int i = 0; i < 20; i++){
            System.out.println(arr1[i]);
        }
    }
}
