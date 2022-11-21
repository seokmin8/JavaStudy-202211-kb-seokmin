package j11_상속;
/*
    상속이란 하나의 클래스에 다른 클래스를 확장하는 개념
    상위 클래스의 접근 지정자가 private인 것들은 하위 클래스에서 접근 못함
 */

public class B extends A{

    private String b;

    public B(){
//        b = a;  // A클래스에 public a변수가 있기때문에 여기서 바로 사용가능
        b = getA(); // private일 때는 getter로 접근
    }

}
