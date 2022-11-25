package j14_스태틱.빌더;

public class StudentMain {
    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(20221100)
                .name("석민")
                .address("부산")
                .build();
        // Student.builder <<< 까지는 Student-builder 객체생성, 마지막의 build는 주소를 호출?

        System.out.println(student);

    }
}
