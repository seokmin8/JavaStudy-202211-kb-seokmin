package j10_배열;

public class Array2 {
    public static void main(String[] args) {
        String[] str1 = new String[100];
        String[] names = new String[100];

        names[0] = "임지현";
        names[1] = "신경수";
        names[2] = "고희주";
        names[3] = "문승주";
        names[4] = "장건녕";

        str1[0] = "이름1";
        str1[1] = "이름2";
        str1[2] = "이름3";
        str1[3] = "이름4";
        str1[4] = "이름5";

        for(int i = 0; i < names.length; i++) {
            System.out.println(str1[i] + (i + 5) + ": "  + names[i]);
        }

    }
}

/*
 names라는 배열생성
 임지현
 신경수
 고희주
 문승주
 장건녕
 위의 값을 순서대로 대입!

 결과는
 이름1: 임지현
 이름2: 신경수
 이름3: 고희주
 이름4: 문승주
 이름5: 장건녕

 */