import javax.swing.JOptionPane;

public class SistemaAvaliacao {

    public static void main(String[] args) {
        String inputNota1 = JOptionPane.showInputDialog("Digite a nota da Prova 1:");
        double nota1 = Double.parseDouble(inputNota1);

        String inputNota2 = JOptionPane.showInputDialog("Digite a nota da Prova 2:");
        double nota2 = Double.parseDouble(inputNota2);

        String inputNotaTrabalho = JOptionPane.showInputDialog("Digite a nota do Trabalho:");
        double notaTrabalho = Double.parseDouble(inputNotaTrabalho);

        double media = (nota1 + nota2 + notaTrabalho) / 3.0;

        String mensagemResultado;
        if (media >= 6.0) {
            mensagemResultado = String.format("Média: %.2f. Aluno APROVADO!", media);
        } else {
            mensagemResultado = String.format("Média: %.2f. Aluno REPROVADO!", media);
        }

        JOptionPane.showMessageDialog(null, mensagemResultado);
    }
}
