package j10_배열;

public class Array5 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 8, 9, 16, 17};
        int[] nums2 = new int[]{2, 7, 10, 15, 18};
        int[] nums3 = new int[]{3, 6, 11, 14, 19};
        int[] nums4 = new int[]{4, 5, 12, 13, 20};

        int[] resultArray = new int[5];    // 현재는 5개의 인덱스 모두 0이 들어가있다!!0
        
        


        int a = 10;
        int b = 5;
        int c = 7;

        int min = a;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        System.out.println("min : " + min);

    }
}
/*
첫번째(인덱스) 중에 최소값을 뽑고 그다음 인덱스에서 최소값을 계속 뽑아내서
그 배열의 내용들로 새로운 배열을 만든다

 */
