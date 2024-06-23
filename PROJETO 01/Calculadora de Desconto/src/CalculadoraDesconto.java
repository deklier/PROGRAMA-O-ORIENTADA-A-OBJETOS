import java.util.Scanner;

public class CalculadoraDesconto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite a porcentagem de desconto: ");
        double percentualDesconto = scanner.nextDouble();

        double valorDesconto = valorProduto * (percentualDesconto / 100);
        double valorFinal = valorProduto - valorDesconto;

        System.out.println("Valor do desconto: " + valorDesconto);
        System.out.println("Preço final do produto após desconto: " + valorFinal);

        scanner.close();
    }
}
 