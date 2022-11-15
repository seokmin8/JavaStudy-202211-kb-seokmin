package j06반복;

public class Loop2 {
    public static void main(String[] args) {
        /*
             [2단]
            2 x 1 = 2
            2 x 2 = 4
            2 x 3 = 6
            ...
            2 x 9 = 18
         */

        for(int j = 0; j < 8; j++){
            int dan = 2 + j;
            System.out.println("[" + dan + "단]");
                for(int i = 0; i < 9; i++) {
                    int num = i + 1;
                    System.out.println(dan + " x " + num + " = " + (dan * num));
                }
        }
    }
}
