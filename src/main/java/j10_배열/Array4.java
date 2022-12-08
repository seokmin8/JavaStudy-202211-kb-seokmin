package j10_배열;

    public class Array4 {

        public static int[] add(int[] array, int value) {
            int[] resultArray = new int[array.length + 1];  // 기존의 배열보다 인덱스가 1 큰 배열을 만든다

            for(int i = 0; i < array.length; i++) {     // 중복된 값 1개가 발견되면 인덱스가 1추가된 새 배열을 받고
            											//기존배열의 상태를 그대로 대입, 제일 마지막값을 추가
                resultArray[i] = array[i];
            }	// 기존배열 길이만큼 반복동작, 
            	// array1과 array2의 중복값이 있을 때 텅 비어있는 배열을 보내준다, array[i]는 중복된 값 1개!
        		// 만약 중복값이 6일때? add가 호출 처음 호출된 resultArray[0]의 인덱스 값은 0이고 호출 될 때마다 1씩 늘어난다 
            
            resultArray[array.length] = value; // 배열 마지막 공간에 value를 넣어라
            // array.length의 처음값은 0이다 여기에 새로운값=중복된값(value)을 대입!
            // 그값을 리턴해주고 getDup메서드 resultArr에 전달된다
            return resultArray;
        }	// 새로 만들어진 배열을 int[] resultArr 로 리턴(6행)


        public static int[] getDuplicateArray(int[] array1, int[] array2) {
            int[] resultArray = new int[0];     // 아무것도 없는 배열 생성
            // 중복된 값 = 배열 을 그대로 대입해가는 반복
            // add메서드에 값을 전달(중복된값)
            // 겹친값이 없으면 0이다.
            // i=2 j=0 일때 [0]인덱스에 3, value 3을 add로 전달
            // length+1 은 [0,1] 형태로 있을것

            for(int i = 0; i < array1.length; i++) {        // array1의 길이 10, 반복중 array1[]의 첫번째 값은 1이다? 
                for(int j = 0; j < array2.length; j++) {    // 2를
                    if(array1[i] == array2[j]) {    // array1의 [0]과 array2[0]부터 비교반복 시작
                        resultArray = add(resultArray, array1[i]);  // resultArray는 배열이다! 중복된 값을 result에 대입
                        // 2번째 중복된 값이 나타났을 때 resultArr에는 5가 들어있고 인덱스는 1, array[]에는 7이 전달되고 다시 위 add로 전달된다
                        // (0) ~ (0 ~ 9) =  1 == 6,~ 6 == 6 이 처음 중복값이 나타난다 그 후의 반복문의 if는 실행 x
                        // result의 공간은 0(아무것도 없다) add를 넘겨준다 result는 0 , array[]는 6 대입시킨다
                        // 이후 add의 array.length의 현재는 0 get 에서 add 매개변수로 값이 전달된다 
                        // 
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