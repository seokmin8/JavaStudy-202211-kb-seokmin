package j13_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentMain {

    public static void print(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {

        Student student = new Student(20221101, "석민");
        Student student2 = new Student(20221101, "석민");
        // stu2가 가진 문자열값을 다르게 하면 equals에서 false를 출력
        // 현재 student에서 equals를 주소가 아니라 가진값으로 비교하도록 재정의 되어있어서 true가 출력된다

        System.out.println(student);
        System.out.println(student2);

        System.out.println(student == student2);    // 주소값 비교
        System.out.println();
        System.out.println(student.equals(student2)); // stu 와 stu2가 가진 값(정보)로 비교하도록 재정의
        // 원래의 equals -> this==obj 비교
        // this - student , obj - student2

        System.out.println();

        print(student);
        // 본래 ( )안에는 object의 객체가 들어가야 한다 -> object클래스를 상속받고 있기 때문에 업캐스팅이 된다
        // 여기의 주소가 print 메서드 obj로 업캐스팅 되어짐~!

        System.out.println(student.hashCode()); // hashcode => 출력되어지는 숫자가 실제 주소이다!!
        System.out.println(student2.hashCode()); // 재정의 후 확인해보면 같은 값이 나온다. 주소값 확인용 만은 아니다
        //

        // Object - Class - getClass
        Class c = student.getClass();   // 어떤 패키지의 어떤 클래스인지 나타낸다
        System.out.println(c);
        System.out.println(c.getName()); // 이것도 어떤 클래스인지
        System.out.println(c.getSimpleName());  // 클래스명만 표시

        System.out.println("===============");

        Field[] fields = c.getDeclaredFields();    // 필드 배열!!!
        for(int i = 0; i < fields.length; i++){
            System.out.println(fields[i].getName());
        }

        Method[] methods = c.getDeclaredMethods();
        for(int i = 0; i < methods.length; i++){
            System.out.println(methods[i].getName());
        }
    }
}
