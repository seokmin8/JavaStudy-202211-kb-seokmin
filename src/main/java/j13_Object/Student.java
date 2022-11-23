package j13_Object;

import java.util.Objects;

public class Student {

    private int code;
    private String name;

    public Student(int code, String name){
        this.code = code;
        this.name = name;
    }
    //  Alt + Ins => equals-hash 재정의
    // 주소가 아니라 가진 값으로 비교를 하도록 overide 한거 그래서 true가 출력될 수 있다
    @Override
    public boolean equals(Object o) {   // 재정의 할 때 o << 변수명은 변경가능, 자료형은 변경하면 안됨
        if (this == o) return true;     // 먼저 this와 o의 주소값 비교 , 같을 시 바로 return하여 equals 끝!
//        if (o == null || getClass() != o.getClass()) return false;  // 주소가 다를 때 여기로 넘어온다
                        // 클래스 자체의 객체비교! => 클래스 타입 비교!!
        if (o == null || getClass() != o.getClass()) return false;
        //              !(o instanceof Student) // getClass()는 객체비교! instanceof 와 대체될 것이다

        Student student = (Student) o;  // object를 student로 다운캐스팅 한다 o의 데이터를 사용해서 확인해야하기 때문
        return code == student.code && Objects.equals(name, student.name);
        // 숫자열과 && (Objects)객체(문자열) 확인 -> Objects.equals( ) 괄호안에는 숫자타입도 들어갈 수 있다!

        // return에서 hash코드로 비교하도록 설계도 가능함
    }
    // getClass는 내부의 값이 완전히 동일하더라도 패키지가 다르면 false 이다
    // ㄴ> Class자체의 값을 가르킨다

    // hash코드는 다른 주소값이더라도 내부의 값 또는 주소값으로 표현한다

    @Override
    public int hashCode() { // 추상메서드처럼 보이지만 native 메서드이다 native << C언어에서 실제메모리에 연결되어있는 주소를 사용할 때
        return Objects.hash(code, name); // hash( ,,,,,)안에 매개변수를 여러개 넣어줄 수 있다
    }   // 재정의하면 어떤 클래스인지 따지지 않음! 내부의 데이터만 확인함
        // hashcode에서 확인되는것은 jvm에서 만들어놓은 가상 메모리주소이다
    //  Alt + Ins => toString 재정의
     @Override
    public String toString() {
        return "Student{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
