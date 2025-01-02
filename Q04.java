import java.util.*;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1, fibonacci;

        System.out.println("Sequência de Fibonacci com 10 números:");
        System.out.print(a + " " + b);

        for (int i = 3; i <= 10; i++) {
            fibonacci = a + b;
            System.out.print(" " + fibonacci); 
            a = b; // Atualiza o primeiro número anterior.
            b = fibonacci; // Atualiza o segundo número anterior.
        }

        sc.close();
    }
}