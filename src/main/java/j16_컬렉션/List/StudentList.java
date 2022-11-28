package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        // 1. ArrayList 사용x List를 사용(업캐스팅)

//        Student student = new Student(20221100, "황석민", 2);
        // 3. Student 객체생성

//        students.add(student);    // 아래와 같은 방법으로도 가능
//        students.add(new Student(20221100, "황석민", 20));
        // 2. add되어야 할것은 Student 객체 자체
        students.add(new Student(20221101, "이승아", 21));
        students.add(new Student(20221102, "김수현", 22));
        students.add(new Student(20221103, "문경원", 23));
        students.add(new Student(20221104, "홍지혜", 24));
        students.add(new Student(20221105, "고동현", 25));

        int size = students.size();

        Student student2 = students.get(3); // 출력할 인덱스 번호

        System.out.println(student2);

        // 이름이 문경원인 학생의 나이를 26세로 바꾸시오
//        students.get(2).setAge(26);
        // 2번 인덱스에 있는 student 의 주소값을 가져옴
//        System.out.println(students.get(2));
        System.out.println("<<< 일반 for >>>");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getName().equals("문경원")) {
                s.setAge(26);
                break;
            }
        }
        System.out.println(students);
        System.out.println(students.get(3));
        System.out.println();
        System.out.println("<<< for-each >>>");
        for (Student s : students) {
            if (s.getName().equals("문경원")) {
                s.setAge(26);
                break;
            }
        }
        System.out.println(students);
        System.out.println(students.get(3));

        // 0번 인덱스 학생의 이름을 다음 인덱스의 학생 이름으로 변경하기
        // 제일 마지막 인덱스의 학생 이름을 0번 인덱스로 이동

        String lastName = null; // 따로 빈 공간을 하나 선언

        for (int i = 0; i < students.size(); i++) {
            int nowIndex = students.size() - 1 - i;     // 뒤에서부터 하나씩 반복
            int preIndex = nowIndex - 1;                // 현재보다 1칸 앞
            Student s = students.get(nowIndex);         // s는 반복되는 index 넘버

            if (nowIndex == 0) {        // 가장 앞 index일때 ( 제일 마지막 )
                s.setName(lastName);    // 빼놓았던 마지막 이름을 가장 앞으로 이동
                break;
            }
            if (nowIndex == students.size() - 1) {  // 마지막 index의 이름
                lastName = s.getName();             // 따로 빼놓는다
            }
            s.setName(students.get(preIndex).getName());
        }
        System.out.println("============");
        System.out.println(students);
        System.out.println("============");


//        for(int i =0; i < students.size(); i++){
//            Student s = students.get(i);
//            s.setName(s.getName());
//            if(students.get(i).setName(students.get(i+));
//
//        }

    }
}
