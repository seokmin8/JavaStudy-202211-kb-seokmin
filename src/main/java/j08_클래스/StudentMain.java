package j08_클래스;

public class StudentMain {

    public static void main(String[] args) {

        Student student1 = new Student("부산대학교", "홍길동", 3, true);
        Student student2 = new Student("부경대", "이꽃순", 2, false);
        Student student3 = new Student();

        student3.school = "해양대";
        student3.name = "강혁";
        student3.studentYear = 4;
        student3.gender = true;


//        System.out.println(student1);
//        System.out.println();
        student1.showStudentInfo();
        student2.showStudentInfo();
        student3.showStudentInfo();

    }
}
