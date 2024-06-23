import javax.swing.JOptionPane;

public class GeradorTabuada {

    public static void main(String[] args) {
        String inputNumero = JOptionPane.showInputDialog("Digite um número para gerar a tabuada:");
        int numero = Integer.parseInt(inputNumero);

        JOptionPane.showMessageDialog(null, "Tabuada do " + numero + ":\n" + gerarTabuada(numero));
    }

    public static String gerarTabuada(int numero) {
        StringBuilder tabuada = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            tabuada.append(numero).append(" x ").append(i).append(" = ").append(resultado).append("\n");
        }
        return tabuada.toString();
    }
}
