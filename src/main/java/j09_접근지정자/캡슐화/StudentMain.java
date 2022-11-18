package j09_접근지정자.캡슐화;

public class StudentMain {

    public static void main(String[] args) {

        Student s1 = new Student("석민", "남");
        // private 멤버변수 때문에 접근이 안되서 생성자에게 접근을 부탁함!!
        // Student의 데이터에 접근하기 위해서는 메소드를 통해 확인가능!!
        s1.printInfo();

        s1.setName("석미");
        s1.printInfo();

        s1.gender = "여";
        s1.printInfo();
        System.out.println(s1.gender);

        System.out.println(s1.getName()); // get은 리턴값이 있으니 그 값을 println


    }
}
