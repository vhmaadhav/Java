package Kunal;

public class pattern {
    static void main() {
        //pattern1(5);
        //pattern2(5);
        //pattern3(5);
        //pattern4(5);
        pattern5(5);
    }
    static void pattern1(int n) {
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern2(int n) {
        for(int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i = 1; i <= n ; i ++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i>=1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
}
