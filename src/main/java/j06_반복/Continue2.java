package j06_반복;

public class Continue2 {

    public static void main(String[] args) {

        for(int i = 0; i < 100; i++) {  // for문은 continue 만나면! 후처리를 만난 후 조건으로 간다
//            if(i % 2 != 0){ // 홀수일때 continue를 만나게 함, 출력은 짝수만
            if(i % 2 == 0){ // 짝수일때 continue를 만나게 함, 출력은 홀수만
            continue;
            }
            System.out.println(i);
        }

    }
}
