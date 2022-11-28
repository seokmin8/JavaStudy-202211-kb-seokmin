package j16_컬렉션.List;

import java.util.ArrayList;

public class StringList {

    public static void main(String[] args) {
        String[] strArray = new String[3];

        strArray[0] = "Java";
        strArray[1] = "Jsp";
        strArray[2] = "Servlet";

        // 일반 for문
        System.out.println("<<<<< 일반 반복 >>>>>");

        for(int i =0; i < strArray.length; i++){
            System.out.println(strArray[i]);
        }

        System.out.println();

        // for-each
        System.out.println("<<<<< foreach >>>>>");
        for(String str : strArray){
            // strArray 위치에 들어가는것은 데이터의 집합들!
            // str에 순서대로 대입 (순서를 표시할 인덱스값은 없음)
            System.out.println(str);
        }

        ArrayList<String> strList = new ArrayList<String>(10);  // 생성까지
        // 1. 값 추가(Create) = add(값), add(index, 값)
        // 공간을 지정하지 않아도 생성, ()안에 크기를 정할 수 있다 () 4개를 써도 들어감, 기본적으로 10할당
        // 담겨있는 데이터의 크기보다 1.5배 커지도록 자동으로 할당, 얘도 생성자임.
        // 만약11개가 필요하다? (11)로 지정해준다. 보통 명시하지 않음 (메모리가 부족한 기기에서 지정해서 사용)
        strList.add("Java");
        strList.add("jsp");
        strList.add("Servlet");
        strList.add("될까?");
        strList.add(1, "C++");
        strList.add(0, "맨앞으로");
        // 1번 자리에 담으면, 값이 덮혀지지 않고 위치에 추가된다. 공간도 자동으로 넓어짐!

        System.out.println("<<<<< List foreach >>>>>");
        for(String str : strList){
            System.out.println(str);
        }

        // 2. 값 조회(Read) -> get(index)
        System.out.println("<<<<< List 일반for >>>>>");
        for(int i = 0; i < strList.size(); i++){
            System.out.println(strList.get(i)); // list에서 가지고와라 i번째의 값
            // set<E>에는 get 메서드가 없다
        }
        // C.R.U.D

        // 3. 값 수정(Update) -> set(index, 값)
        strList.set(0, "HTML5");

        System.out.println(strList); // toString 으로 확인가능!

        // 4. 값 삭제(Delete) -> remove(index)
        String removeData = strList.remove(2);
        System.out.println(removeData);
        System.out.println(strList);
    }
}
