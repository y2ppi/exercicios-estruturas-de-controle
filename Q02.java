import java.util.*;

public class Q02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int placa, ultimoDigito;
        String vistoria;

        System.out.println("Digite a placa (apenas os números) do seu carro: ");
        placa = sc.nextInt();

        ultimoDigito = placa % 10;

        switch (ultimoDigito) {
            case 0:
            vistoria = "Janeiro do próximo ano";
                break;
            
            case 1:
            vistoria = "Fevereiro do próximo ano";
                break;

            case 2:
            vistoria = "Março do próximo ano";
                break;

            case 3:
            vistoria = "Abril do próximo ano";
                break;

            case 4:
            vistoria = "Maio do próximo ano";
                break;

            case 5:
            vistoria = "Junho do próximo ano";
                break;

            case 6:
            vistoria = "Setembro deste ano";
                break;

            case 7:
            vistoria = "Outubro deste ano";
                break;

            case 8:
            vistoria = "Novembro deste ano";
                break;

            case 9:
            vistoria = "Dezembro deste ano";
                break;
            
            default:
            vistoria = "Último digito inválido";
        }

        System.out.print("Placas que terminam com " + ultimoDigito + " devem realizar a vistoria em " + vistoria);

        sc.close();
    }
}