package j02_변수;

/**
 * 이 주석은 클래스에 대한 설명
 */

public class Variable {

    /**
     * 메소드에 대한 설명
     *
     */
    public static void main(String[] args) {
        boolean checkFlag = false;  // true 또는 false 값이 들어갈 수 있다
        System.out.println("논리자료형 : " + checkFlag);
        checkFlag = true;
        System.out.println("논리자료형 : " + checkFlag);

        char name1 = '황';
        char name2 = '석';
        System.out.println(name1 + name2);  // 출력결과는 유니코드(숫자)
        System.out.println(" " + name1 + name2);
        System.out.println(name1); // 결과는 문자
        System.out.println(Integer.toHexString(name1)); // 16진수 결과값
        System.out.println("\ud669");

        int width = 100;
        int width2 = 200;

        System.out.println(width + width2); // int 는 덧셈연산 가능하다
        String sWidth = "100";
        String sWidth2 = "200";

        System.out.println(sWidth + sWidth2);   // 문자열은 수 연산이 되지 않는다

        double dNum = 2.1;
        double dNum2 = 3.5;
        System.out.println(dNum + dNum2);

        System.out.println("<<<< 형변환 >>>>");
        // 업 캐스팅
        // ㄴ> 문자 -> 정수 -> 실수
        char c1 = 'a';
        System.out.println(c1);
        System.out.println(((int) c1) + 10);   //  문자->정수 형변환, 숫자 연산이 가능(정수로 인식)
        int n1 = (int) c1;      // 변수에 대입하는것은 생략가능하나 출력시엔 명시 해줘야함
        System.out.println(n1);
        double d1 = (double) n1;    // 형변환 ( )자료형 색깔이 회색이면 생략가능
        System.out.println(d1);

        int n2 = (int) d1;          // 형변환 ( )자료형 색깔이 적색이면 생략 불가 -> 명시!!
        System.out.println(n2);

        char c2 = (char)n2;   // 형변환 없이 그냥 n2가 들어오지 못함
        System.out.println(c2);

        // 다운 캐스팅
        // ㄴ> 실수 -> 정수 -> 문자

        /*
        여러줄
        주
        석
         */
    }
}
