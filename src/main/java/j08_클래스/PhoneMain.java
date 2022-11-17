package j08_클래스;

public class PhoneMain {

    public static void main(String[] args) {

        Phone iPhone14 = new Phone();
        Phone galaxyS22 = new Phone("SAMSUNG", "GalaxyS22"); // 생성시점에 값이 들어간 것!
        System.out.println(iPhone14);   // 주소값!
        System.out.println(galaxyS22);  // 주소값 비교!

        iPhone14.company = "Apple"; // 생성시점 이후에 값을 넣은것

//        galaxyS22.company = "Samsung";

        iPhone14.printPhoneCompany();
        iPhone14.printPhoneModel();

        galaxyS22.printPhoneCompany();
        galaxyS22.printPhoneModel();
    }
}
