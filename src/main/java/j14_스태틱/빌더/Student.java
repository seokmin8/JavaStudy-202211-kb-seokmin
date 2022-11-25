package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student {
    private int studentCode;
    private String name;
    private String address;

    public static StudentBuilder builder() {    // 아래의 내부 클래스를 생성하고 리턴해준다
        return new StudentBuilder();
    }

    // 클래스 내부에 또다른 클래스 = 내부클래스
    // 외부클래스가 생성되어야 내부클래스에 접근가능!
    // 빌더 특징 멤버변수가 똑같이 적용된다
    public static class StudentBuilder {
        private int studentCode;
        private String name;
        private String address;



        public StudentBuilder studentCode(int studentCode) {
            this.studentCode = studentCode; // return이 없다면 setter와 같은 기능!!
            return this;
        }
        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }
        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }
        public Student build() {
           return new Student(studentCode, name, address);
           // build
        }
    }
}

