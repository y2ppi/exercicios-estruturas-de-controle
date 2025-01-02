import java.util.*;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;

        do{
            System.out.println("Digite sua senha: ");
            senha = sc.nextInt();
        } while (senha != 1234);
        System.out.println("Senha correta, acesso liberado");

        sc.close();
    }
}