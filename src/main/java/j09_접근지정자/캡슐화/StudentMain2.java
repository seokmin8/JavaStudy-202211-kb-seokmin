package j09_접근지정자.캡슐화;

public class StudentMain2 {


    public static void main(String[] args) {

        Student2 s2 = new Student2();
        Student2 s3 = new Student2();

        s3.stuData1("석민", "부공", 3, true);

        s2.setName("석미에요");
        s3.setSchool("부산대");


        s3.isGender();
        System.out.println("===========");
        String nameS2 = s2.getName();
        System.out.println("===========");
        System.out.println(nameS2);
        System.out.println("===========");
        System.out.println(s2.getName());
        System.out.println("===========");


    }
}
