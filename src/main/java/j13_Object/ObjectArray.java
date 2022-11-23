package j13_Object;

public class ObjectArray {

    public static Object getObject(Object obj){
        return obj;
    }

    public static void main(String[] args) {
        Object[] objects = new Object[8];

        objects[0] = new Student(20221101, "박수현"); // Student를 업캐스팅
        objects[1] = new Car("쏘나타", "화이트");
        objects[2] = new Student(20221102, "박수현");
        objects[3] = new Car("K5", "블랙");
        objects[4] = new Student(20221103, "황석민");  // toString
        objects[5] = "김준일"; // 일반 자료형으로 출력
        objects[6] = 20221123;
        objects[7] = 20221123.5;

        for(int i = 0; i < objects.length; i++){
            System.out.println(objects[i]);
        }

        System.out.println(objects[5].getClass());  // 확인해보면 단순히 일반자료형은 아니다
        System.out.println(objects[6].getClass());  // Integer
        System.out.println(objects[7].getClass());  // Double
    }
}
