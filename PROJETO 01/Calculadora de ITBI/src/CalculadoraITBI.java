import javax.swing.JOptionPane;

public class CalculadoraITBI {

    public static void main(String[] args) {
        
        String inputTransacao = JOptionPane.showInputDialog("Digite o valor de transação do imóvel:");
        double valorTransacao = Double.parseDouble(inputTransacao);

        String inputVenal = JOptionPane.showInputDialog("Digite o valor venal do imóvel:");
        double valorVenal = Double.parseDouble(inputVenal);

        String inputPorcentagem = JOptionPane.showInputDialog("Digite a porcentagem de ITBI:");
        double percentualITBI = Double.parseDouble(inputPorcentagem);

        double valorITBI = Math.max(valorTransacao, valorVenal) * (percentualITBI / 100);

        JOptionPane.showMessageDialog(null, "O valor do ITBI é: " + valorITBI);
    }
}
