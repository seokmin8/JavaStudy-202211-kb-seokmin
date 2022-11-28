package j16_컬렉션.List;

import java.util.ArrayList;

public class StackList {

    public static void main(String[] args) {

        // 값을 순서대로 담기
        // 임지현, 신경수, 고희주, 문승주, 장건녕, 박수현, 황석민, 박준현

        // for-each로 동작했을 때 출력은 역순으로 나타낸다

        ArrayList<String> stack = new ArrayList<String>();

//        stack.add(0, "임지현");
//        stack.add(0, "신경수");
//        stack.add(0, "고희주");
//        stack.add(0, "문승주");
//        stack.add(0, "장건녕");
//        stack.add(0, "박수현");
//        stack.add(0, "황석민");
//        stack.add(0, "박준현");
//
//
//        for (String name : stack) {
//            System.out.print(name);
//            if (!name.equals(stack.get(stack.size() - 1))){
//                System.out.print(", ");
//            }
//        }

        stack.add("임지현");
        stack.add("신경수");
        stack.add("고희주");
        stack.add("문승주");
        stack.add("장건녕");
        stack.add("박수현");
        stack.add("황석민");
        stack.add("박준현");

        int s = stack.size();
        // 인덱스 사이즈 동일하게 반복하기 위해 변수로 지정
//        for (int i = 0; i < s; i++) {
//            System.out.print(stack.remove(s - i - 1));
//            // remove는 반환하며 삭제하기 때문에 stack.size로 하면 반복될수록 크기가 줄어들어 다 돌지못함
//        }

        ArrayList<String> copyList = new ArrayList<String>();

        for (int i = 0; i < s; i++) {
            copyList.add(0, stack.remove(s - i - 1));
        }
        System.out.println(copyList);

    }
}
