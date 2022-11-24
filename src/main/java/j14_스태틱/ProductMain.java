package j14_스태틱;

import j07_메소드.Method1;

public class ProductMain {

    public void show(){
        System.out.println("메인 메소드에서 호출");
    }

    public static void main(String[] args) {
    // new 순간에 class가 복제됨 - static 영역은 복사되지 않는다 (원본 주소만 참조)
        Product product1 = new Product("아이폰14");
        Product product2 = new Product("아이폰14_Mini");

        System.out.println(product1);
        System.out.println(product2);

        product1.print();
        product2.print();
        Product.print();

        ProductMain pm = new ProductMain();

        pm.show();  // 클래스에 속한 메소드이기 때문에 static이 아닌경우는 반드시 생성되어야 함

        Method1.main(new String[] {});
        Method1.main(null);
        System.out.println("======");
        Method1.method1();
        // 생성되지 않은 Method1 클래스의 메인메소드를 호출하였다
        // ( )안에는 매개변수 맞춰주기만 하고 호출이 가능
    }
}
