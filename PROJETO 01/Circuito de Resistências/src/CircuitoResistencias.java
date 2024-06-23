import javax.swing.JOptionPane;

public class CircuitoResistencias {

    public static void main(String[] args) {
        String inputR1 = JOptionPane.showInputDialog("Digite o valor da Resistência 1:");
        double r1 = Double.parseDouble(inputR1);

        String inputR2 = JOptionPane.showInputDialog("Digite o valor da Resistência 2:");
        double r2 = Double.parseDouble(inputR2);

        String inputR3 = JOptionPane.showInputDialog("Digite o valor da Resistência 3:");
        double r3 = Double.parseDouble(inputR3);

        String inputR4 = JOptionPane.showInputDialog("Digite o valor da Resistência 4:");
        double r4 = Double.parseDouble(inputR4);

        double req = r1 + r2 + r3 + r4;

        double maior = Math.max(Math.max(r1, r2), Math.max(r3, r4));
        double menor = Math.min(Math.min(r1, r2), Math.min(r3, r4));

        JOptionPane.showMessageDialog(null,
                "Resistência Equivalente: " + req + "\nMaior Resistência: " + maior + "\nMenor Resistência: " + menor);
    }
}
