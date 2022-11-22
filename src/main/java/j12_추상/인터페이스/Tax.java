package j12_추상.인터페이스;
/*
    연말정산~
 */
public class Tax implements Calculator{

    // 인터페이스의 메소드를 오버라이드 하지않으면 Tax 메소드를 사용할 수 없다!!
    // 다운캐스팅 하여 별도의 메소드를 사용한다 -> 인터페이스에서
    @Override
    public int calc(int[] values) {
        System.out.println("연말정산을 진행합니다");
        int result = 0;
        for(int i = 0; i < values.length; i++){
            result += values[i];
        }
        return 0;
    }
}
