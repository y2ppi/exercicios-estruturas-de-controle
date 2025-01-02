import java.util.*;

public class Q01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dia, mesNumero, ano;
        String mes;

        System.out.println("insira um dia: ");
        dia = sc.nextInt();

        System.out.println("insira um mes(em número): ");
        mesNumero = sc.nextInt();

        System.out.println("insira um ano: ");
        ano = sc.nextInt();

        switch(mesNumero){
            case 1:
            mes = "Janeiro";
            break;

            case 2:
            mes = "Fevereiro";
            break;

            case 3:
            mes = "Março";
            break;

            case 4:
            mes = "Abril";
            break;

            case 5:
            mes = "Maio";
            break;

            case 6:
            mes = "Junho";
            break;

            case 7:
            mes = "Julho";
            break;

            case 8:
            mes = "Agosto";
            break;

            case 9:
            mes = "Setembro";
            break;

            case 10:
            mes = "Outubro";
            break;

            case 11:
            mes = "Novembro";
            break;

            case 12:
            mes = "Dezembro";
            break;

            default:
            mes = "0"; 
            System.out.println("mes inválido");
        }
        System.out.print(dia + " de " + mes + " de " + ano);

        sc.close();
    }
}