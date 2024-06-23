import javax.swing.JOptionPane;

public class CalculadoraAposentadoria {

    public static void main(String[] args) {
        String inputIdade = JOptionPane.showInputDialog("Digite a idade:");
        int idade = Integer.parseInt(inputIdade);

        String sexo = JOptionPane.showInputDialog("Digite o sexo (M para masculino, F para feminino):");
        sexo = sexo.toUpperCase(); 
        
        String inputAnosContribuicao = JOptionPane.showInputDialog("Digite os anos de contribuição:");
        int anosContribuicao = Integer.parseInt(inputAnosContribuicao);

        boolean podeAposentar = false;
        int anosFaltantes = 0;

        if (sexo.equals("M")) {
            if (idade >= 65) {
                podeAposentar = true;
            } else {
                anosFaltantes = 65 - idade;
            }
        } else if (sexo.equals("F")) {
            if (idade >= 62 && anosContribuicao >= 15) {
                podeAposentar = true;
            } else {
                if (idade < 62) {
                    anosFaltantes = 62 - idade;
                } else if (anosContribuicao < 15) {
                    anosFaltantes = 15 - anosContribuicao;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Sexo inválido. Por favor, execute o programa novamente.");
            System.exit(0);
        }

        if (podeAposentar) {
            JOptionPane.showMessageDialog(null, "Você pode se aposentar!");
        } else {
            JOptionPane.showMessageDialog(null, "Você ainda não pode se aposentar. Faltam " + anosFaltantes + " anos.");
        }
    }
}
