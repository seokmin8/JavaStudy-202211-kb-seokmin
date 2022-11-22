package j12_추상.인터페이스;

/*
    급여정산~
 */
public class Salary implements Calculator {

    @Override
    public int calc(int[] values) {
        System.out.println("급여 정산을 시작합니다");
        int result = 0;
        for(int i = 0; i < values.length; i++){
            result += values[i];
        }

        result = (result - (int) (result * 0.03)); // 0.03 앞에 명시적 형변환

        return result;
    }
}
