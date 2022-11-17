package j06_반복;

public class Loop3 {
    public static void main(String[] args) {
        /*
        1.
            *
            **
            ***
            ****
            *****
        2.
            *****
            ****
            ***
            **
            *
        3.
                *
               **
              ***
             ****
            *****
        4.
            *****
             ****
              ***
               **
                *

        5.
            *********
             *******
              *****
               ***
                *
         */

        int n = 5;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        } // ed.f1
        System.out.println();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            System.out.println();
        } // end.f2
        System.out.println();

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        } // end.f3
        System.out.println();

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        } // end. f4
    }
}
