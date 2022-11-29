package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList2 {

    public static void main(String[] args) {
        // 배열을 list로 변경!
        // 1. Hobby에서 @data랑 @builder 넣기
        // 2. 객체로 리스트 만들어두기
        // 3. List<> 작성!
        // 4. new Hobby[] 배열 선언 및 생성
        // 5. Arrays.asList()로 묶어주기
        // 6. new ArrayList<Hobby> 대신 asList(배열명)로

        // toArray는 배열로 변경될때 타입은 Object 타입으로 바뀌기 때문에 다운캐스팅을 해서 사용해야 함!

        List<Hobby> hl =
//                new ArrayList<Hobby>();    생략!
                Arrays.asList(new Hobby[]{
                        new Hobby(1, "축구"),     // 여기는 hl.get(0) 이다
                        new Hobby(2, "농구"),
                        new Hobby(3, "골프"),
                        new Hobby(4, "음악감상")
                });

        // 학생개체 생성
        Student s1 = Student.builder()
                .studentId(20221101)
                .name("고동현")
                .age(20)
                .hobbyList(Arrays.asList(new Hobby[]{hl.get(0), hl.get(2)}))
                // 여기를 잘 봐두자
                // 목록을 만든 후 생성 시 선택함에 따라 새로운 목록을 만들어 주는것
                .build();

        Student s2 = Student.builder()
                .studentId(20221102)
                .name("강동욱")
                .age(21)
                .hobbyList(Arrays.asList(new Hobby[]{hl.get(1), hl.get(3)}))
                // 여기를 잘 봐두자
                // 목록을 만든 후 생성 시 선택함에 따라 새로운 목록을 만들어 주는것
                .build();

        Student s3 = Student.builder()
                .studentId(20221103)
                .name("정진호")
                .age(23)
                .hobbyList(Arrays.asList(new Hobby[]{hl.get(0), hl.get(3)}))
                // 여기를 잘 봐두자
                // 목록을 만든 후 생성 시 선택함에 따라 새로운 목록을 만들어 주는것
                .build();


        System.out.println(s1);

        List<Student> sl = new ArrayList<Student>();
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);

        // 설명 1. 학생정보
        for(Student s : sl) {
            System.out.println("<학생정보>");
            System.out.println(s);
            System.out.println("<" + s.getName() + "학생 취미>");
            for(Hobby h  : s.getHobbyList()) {  // getter형태로 List를 가지고 온다
                System.out.println(h);      // 모든요소 h
            }
            System.out.println();
        }

        List<String> nameList = Arrays.asList(new String[]{
                "일번",
                "이번",
                "삼번"
        });

        for (Hobby h : hl) {
            System.out.println(h);
        }

        String[] names = new String[]{"일번", "이번", "삼번"};

        List<String> nameList1;
        nameList1 = Arrays.asList(names);
        // 배열 생성과 대입을 한번에도 가능, 지금은 나누어져 나와있음!

        Object[] nameArray = nameList.toArray();
//        String[] nameArray1 = (String[]) nameList.toArray();
        System.out.println((String) nameArray[0]);   // 위처럼 배열 자체를 다운캐스팅을 해도 안된다
        // 배열자체를 다운캐스팅을 하는게 아니라, 담고있는 값들을 다운캐스팅 해서 사용해야한다

    }

}
