package j10_배열;

public class Array5_1 {

    public static int getMinNumber(int num1, int num2) {
        return num1 < num2 ? num1 : num2;
    }   // 3항 연산~~~


    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 8, 9, 16, 17};
        int[] nums2 = new int[]{2, 7, 10, 15, 18};
        int[] nums3 = new int[]{3, 6, 11, 14, 19};
        int[] nums4 = new int[]{4, 5, 12, 13, 20};

        int[] resultArray = new int[5];
        // 배열 중 동일 인덱스에 위차한 값들 중 최소값을 뽑아 새로운 배열생성

        for (int i = 0; i < nums1.length; i++) {
            resultArray[i] = getMinNumber(getMinNumber(nums1[i], nums2[i]),getMinNumber(nums3[i], nums4[i]));
            System.out.println(resultArray[i]);
            // 매개변수 값에 메서드가 2개 들어간다
            // 2배열 중 작은값, 그 2배열 중 작은 값이 result
        }

        int a = 10;
        int b = 5;
        int c = 7;
    }

}
