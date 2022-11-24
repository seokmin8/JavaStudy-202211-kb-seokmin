package j14_스태틱;

/*
    공유영역 (정적영역)
    static 선언이 되는 순간부터 메모리에 영역할당이 된다
 */

import lombok.Data;

@Data
public class Product {
 // static 변수를 사용(접근)하기 위해서는 메소드도 static 이어야 한다
 // public static 메소드에 접근할 때 생성을 하지 않아도 접근이 된다.
 // ㄴ> 메소드 안으로 private 변수를 포함시켰을 땐 그 변수에 접근되지 않는다.
    private static int autoIncrement = 20221100;
    private int serialNumber;
    private static String name1;
    private String name2;

    public Product(String name){
        this.serialNumber = ++autoIncrement;    // 자동으로 1씩 증가됨
        this.name1 = name;
        this.name2 = name;
    }
    public static void print(){
        System.out.println(autoIncrement);
//        System.out.println(serialNumber);  접근 안됨!
        Product product = new Product("모니터");
//        System.out.println(product.getSerialNumber());
        product.add(10, 20);
    }
    public int add(int a, int b){
        return a + b;
    }

}

//    public static String getName(){
//        return name;
//    }
//    public static void setName(String name){
//        this.name = name; // this 사용 못함
//        Product.name = name;
//    }

