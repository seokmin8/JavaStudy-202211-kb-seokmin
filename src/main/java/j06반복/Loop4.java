package j06반복;

public class Loop4 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 1 + (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        } // end of for 1

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (n * 2) - ((i + 1) * 2 - 1); j++) {
                //  j(0)    j <  ( 10 ) -  (( 1 ) * 2 - 1 )=> 9 [1회차],  [ 2회차 ] => 7
                System.out.print("*");
            }
            System.out.println();
        } // end of for 2
    }
}
