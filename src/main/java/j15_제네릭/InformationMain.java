package j15_제네릭;

public class InformationMain {
    public static void main(String[] args) {

//        Information<Student> studentInformation = new Information<Student>(Student.builder().studentCode(20225000).name("석민1").build());
        // <> 안에 타입을 넣어준다.
        // 위처럼 하는것을 (1번) 방법
        // 아래처럼 (2번) 해도 됨
        Student student = Student.builder()
                .studentCode(20229000)
                .name("석민2")
                .build();
        Teacher teacher = Teacher.builder()
                .teacherCode(20221000)
                .name("쌤")
                .build();


        Information<Student> studentInformation
                = new Information<Student>(student);
        // <>안의 자료형은 생성되는 시점에 정해짐!
        Information<Teacher> teacherInformation
                = new Information<Teacher>(teacher);

        // Information2 는 Object 타입 => 사용하려면 다운캐스팅을 해줘야함.
        Information2 i1 = new Information2(student);
        Information2 i2 = new Information2(teacher);

        studentInformation.printInfo();
        teacherInformation.printInfo();

        System.out.println("학생이름 : " + studentInformation.getTarget().getName());
        // target이 student 이고, 다운캐스팅 안해도 됨 = 제네릭을 사용하면 다운캐스팅은 하지않아도 된다
        System.out.println("학생이름2 : " + ((Student)i1.getTarget()).getName());
        // Object 이기 때문에 student로 다운캐스팅을 해야 getName에 접근


    }
}
