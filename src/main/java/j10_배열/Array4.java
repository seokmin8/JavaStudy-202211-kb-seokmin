package j10_배열;

    public class Array4 {

        public static int[] add(int[] array, int value) {
            int[] resultArray = new int[array.length + 1];  // 기존의 배열보다 인덱스가 1 큰 배열을 만든다
// 6 0~4 5
            for(int i = 0; i < array.length; i++) {    // 기존배열의 상태를 그대로 대입, 제일 마지막값을 추가
                resultArray[i] = array[i];
            }
            resultArray[array.length] = value;

            return resultArray;
        }


        public static int[] getDuplicateArray(int[] array1, int[] array2) {
            int[] resultArray = new int[0];     // 아무것도 없는 배열 생성
            // 중복된 값 = 배열 을 그대로 대입해가는 반복
            // add메서드에 값을 전달(중복된값)
            // 겹친값이 없으면 0이다.
            // i=2 j=0 일때 [0]인덱스에 3, value 3을 add로 전달
            // length+1 은 [0,1] 형태로 있을것

            for(int i = 0; i < array1.length; i++) {        // array1 에
                for(int j = 0; j < array2.length; j++) {    // 2를
                    if(array1[i] == array2[j]) {    // array1의 [0]과 array2[0]부터 비교반복 시작
                        resultArray = add(resultArray, array1[i]);  // resultArray는 배열이다! 중복된 값을 result에 대입
                    }
                }
            }

            return resultArray;
        }

        public static int[] getNonDuplicateArray(int[] array1, int[] array2) {
            int[] resultArray = new int[0];

            for(int i = 0; i < array1.length; i++) {
                int duplicateCountInArray1 = 0;

                for(int j = 0; j < array2.length; j++) {
                    if(array1[i] == array2[j]) {
                        duplicateCountInArray1++;
                    }
                }
                if(duplicateCountInArray1 != 0) {
                    continue;
                }
                resultArray = add(resultArray, array1[i]);
            }


            for(int i = 0; i < array2.length; i++) {
                int duplicateCountInArray2 = 0;

                for(int j = 0; j < array2.length; j++) {
                    if(array2[i] == array1[j]) {
                        duplicateCountInArray2++;
                    }
                }
                if(duplicateCountInArray2 != 0) {
                    continue;
                }
                resultArray = add(resultArray, array2[i]);
            }

            return resultArray;
        }

        public static int getMinNumberInArray(int[] array) {    // 꺼낸 값이 min보다 작으면 min으로 대입
            int min = array[0];

            for(int i = 0; i < array.length; i++) {
                if(array[i] < min) {
                    min = array[i];
                }
            }

            return min;
        }

        public static int getMaxNumberInArray(int[] array) {
            int max = array[0];

            for(int i = 0; i < array.length; i++) {
                if(array[i] > max) {
                    max = array[i];
                }
            }

            return max;
        }

        public static void main(String[] args) {

            int[] nums1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] nums2 = new int[] {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
            // 현재 배열내의 값들이 중복이 된다면 먼저 정렬을 해준 뒤 위 작업을 진행한다


            int[] duplicateArray = getDuplicateArray(nums1, nums2);
            int[] nonDuplicateArray = getNonDuplicateArray(nums1, nums2);

            int minNumberInDuplicateArray = getMinNumberInArray(duplicateArray);
            int maxNumberInNonDuplicateArray = getMaxNumberInArray(nonDuplicateArray);

            System.out.println("중복된 값 중 최소값: " + minNumberInDuplicateArray);
            System.out.println("중복되지 않은 값 중 최대값: " + maxNumberInNonDuplicateArray);

        /*
        1. 두 배열에서 중복된 값 중 최소값
        2. 두 배열에서 중복되지 않은 값 중 최대값
         */


        }
    }