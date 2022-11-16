package j06반복;

public class Continue {
    public static void main(String[] args) {

        int count = 0;

        while(true) {
            count++;
            System.out.println("나무를 " + count + "번 찍습니다.");
            if(count < 10){
                continue;   // 지금반복은 넘어가고 다음반복으로 가라
            }
            System.out.println("나무가 넘어갑니다");
            break;  // 자신과 가장 가까운 반복문 멈춤!
        }
    }
}
