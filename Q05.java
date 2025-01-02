import java.util.*;

public class Q05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero, n1, n2, n3, somaNumeros, numeroQuadrado;

        System.out.println("Menu de opções: \n");
        System.out.println("1. Somar dois números \n");
        System.out.println("2. Número ao quadrado \n");
        System.out.println("Digite a opção desejada.");
        numero = sc.nextInt();

        switch (numero) {
            case 1:
            System.out.println("insira um número: ");
            n1 = sc.nextInt();
            System.out.println("insira o segundo número: ");
            n2 = sc.nextInt();
                somaNumeros = n1 + n2;
                System.out.print(somaNumeros);
                break;
            case 2:
            System.out.println("insira um número: ");
            n3 = sc.nextInt();
                numeroQuadrado = n3*n3;
                System.out.print(numeroQuadrado);
                break;
            default: 
                if(numero != 1 && numero != 2){
                    System.out.println("Opção inválida");
                }
                break;
        }
        
        sc.close();
    }
}