package j09_접근지정자.test;

public class Access3 {

    private String address;

    private void printAddress(){
        String address = null;
        System.out.println("address : " + address);     // 메서드 내에 참조값을 주려면 this를 붙히자
    }

}
