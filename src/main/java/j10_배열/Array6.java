package j10_배열;

public class Array6 {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5}; // a 는 배열의 주소
        System.out.println("[배열 a]");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + (i != a.length - 1 ? ", " : "\n"));
        }
        int[] b = a;    // b도 a와 같은 주소값이 된다!

        if (a == b) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }
        // 새로운 배열을 만들어 값을 대입해서 넣어야 같은값의 다른 배열이 된다

        System.out.println("[배열 b]");
        b[3] = 10; // 10이 들어있는 주소가 있다(리터럴)

        // 변수명만 다르고 주소값은 같을 수 있다!

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + (i != b.length - 1 ? ", " : "\n"));
        }
        if (a == b) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + (i != a.length - 1 ? ", " : "\n"));
        }
    }
}
