package j10_배열;

public class Array4_1 {

    public static int[] add(int[] array, int value) {
        int[] resultArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            resultArray[i] = array[i];
        }
        resultArray[array.length] = value; // 이전배열의 크기

        return resultArray;
    }

    public static int[] getDuplicateArray(int[] array1, int[] array2) {
        int[] resultArray = new int[0];
        
        int arrayLength = array1.length;

        if (array1.length > array2.length) {
            arrayLength = array2.length;
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {    // 같으면
                    resultArray = add(resultArray, array1[i]); // 여기에 담는다
                }
            }
        }
        return resultArray;
    }

    public static int[] getNonDuplicateArray(int[] array1, int[] array2) {
        int[] resultArray = new int[0];

        for (int i = 0; i < array1.length; i++) {
            int duplicateCountInArray1 = 0;

            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {    // 같지 않으면
                    duplicateCountInArray1++;
                }
            }
            if(duplicateCountInArray1 != 0){
                continue;
            }
            resultArray = add(resultArray, array1[i]);
        }


        for (int i = 0; i < array2.length; i++) {
            int duplicateCountInArray2 = 0;

            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {    // 같지 않으면
                    duplicateCountInArray2++;
                }
            }
            if(duplicateCountInArray2 != 0){
                continue;
            }
            resultArray = add(resultArray, array1[i]);
        }
        return resultArray;

    }


    public static int getMinNumberInArray(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static int getMaxNumberInArray(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }


    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};     // 여기 배열을 반복을 먼저 돌리고 (기준1.)
        int[] nums2 = new int[]{6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; // 대입하면서 비교를 한다    (기준2.)

        int[] duplicateArray = getDuplicateArray(nums1, nums2);
        int[] nonDuplicateArray = getNonDuplicateArray(nums1, nums2);

        int minNumberInduplicateArray = getMinNumberInArray(duplicateArray);
        int maxNumberInNonDuplicateArray = getMaxNumberInArray(nonDuplicateArray);

        System.out.println("중복된 값 중 최소값 : " + minNumberInduplicateArray);
        System.out.println("중복되지 않은 값 중 최대값 : " + maxNumberInNonDuplicateArray);

        /*
        1. 두 배열에서 중복된 값 중 최소값
        2. 두 배열에서 중복되지 않은 값 중 최대값
         */

    }
}