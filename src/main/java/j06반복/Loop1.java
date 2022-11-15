package j06반복;

public class Loop1 {
    public static void main(String[] args) {

        int n = 10;

        for(int i = 0; i < n; i++) {
            System.out.print(i);
            if(i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        for(int i = 0; i < n; i++) {
            System.out.print(i + n);
            if(i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        for(int i = 0; i < n; i++){
            System.out.print(n - i + 10);
            if(i < n - 1){
                System.out.print(", ");
            }
        }
        System.out.println("");
        for(int i = 0; i < n; i++) {
            System.out.print(n - i);
            if(i < n - 1){
                System.out.print(", ");
            } // end of if
        } // end of for
        System.out.println("");
        for(int i = 0, j = n; i < n; i++, j--){
            System.out.println(i);
            System.out.println(j);
        }

    } // end of main
} // end of class
