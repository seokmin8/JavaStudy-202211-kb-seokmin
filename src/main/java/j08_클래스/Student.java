package j08_클래스;

public class Student {

    String school;
    String name;
    int studentYear;
    boolean gender;

    Student(){}

    Student(String school, String name, int year, boolean gender){
        this.school = school;
        this.name = name;
        this.studentYear = year;
        this.gender = gender;
    }

    public void showStudentInfo(){
        System.out.println("학교명 : " + school);
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + studentYear);
        System.out.println("성별 : " + (gender ? "남" : "여"));
        System.out.println();
        // ( boolean ? true(1) : false (2) )

    }
}
