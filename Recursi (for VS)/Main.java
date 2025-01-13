import java.util.Scanner;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int A = 0; int B = 1;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите целые числа: A");
            if (scanner.hasNextInt()) {
                A = scanner.nextInt();
                System.out.println();
                System.out.println("введите B: ");
                B = scanner.nextInt();
                System.out.println();
            } else {
                System.out.println("Вы ввели не целое число");
            }

            if (A<B) {
                System.out.println(A);
                System.out.println(recursi(A, B));  
            }  else {
                System.out.println(B);
                System.out.println(recursi(B, A));
            }
        }    
    }

    static int recursi(int a, int b) {
        int i = a + 1; 
        if (i == b) {
            return i;
        }
        System.out.println(i);
        return recursi(i, b);
    }
}