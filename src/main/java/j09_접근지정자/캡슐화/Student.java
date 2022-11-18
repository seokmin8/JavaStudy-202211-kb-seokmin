package j09_접근지정자.캡슐화;

public class Student {
    // 데이터는 중요하다!! private로 보호한다!!
    private String name;
    public String gender;

    public Student() {}

    public Student(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    public void setName(String name){   // 메소드는 외부에서 접근 가능하도록 public
        this.name = name;
    }

    public String getName(){
        return name;
    }



    public void printInfo(){
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
    }
}
