package j12_추상.인터페이스;

public class CalcMain {
    public static void main(String[] args) {
        int[] taxPay = {2000000, 2500000, 2600000, 2700000};
        int[] salaryPay = {1000000, 1000000, 1000000, 1000000};

        int result1 = 0;
        int result2 = 0;

        Calculator calculator = new Tax();  // 연말정산 (calculator에 구현된 클래스가 달라짐)
        // Tax가 calculator에 대입되는것 -> 업캐스팅
        result1 = calculator.calc(taxPay);
        if(result1 == 0){
            System.out.println("오류 : " + calculator.ERROR_CODE);
        } else {
            System.out.println("result1 => " + result1);
        }

        calculator = new Salary();      // 급여정산 (calculator에 구현된 클래스가 달라짐)
        result2 = calculator.calc(salaryPay);
        if(result2 == 0){
            System.out.println("오류 : " + Calculator.ERROR_CODE);
        } else {
            System.out.println("result2 => " + result2);
        }



//        tax.calc(new int[] {2000000, 2500000, 2600000, 2700000}); 만약 배열을 사용한다면 이렇게 하지만 잘 사용안함!
    }
}
