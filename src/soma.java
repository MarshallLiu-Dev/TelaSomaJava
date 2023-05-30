import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class soma extends JFrame implements ActionListener {
    private JLabel palavra; 
	private JTextField txtUm;
	private JTextField txtDois;
	private JButton btnSoma;

    public soma(String string) {

    }

    public static void main(String[] args) {
       String numero1String = JOptionPane.showInputDialog(null, "Digite o primeiro número:",
                 "Soma de Números", JOptionPane.QUESTION_MESSAGE);
        if (numero1String == null || numero1String.trim().isEmpty()) {
           JOptionPane.showMessageDialog(null, "Operação cancelada ou número inválido.",
                    "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int numero1;
        try {
            numero1 = Integer.parseInt(numero1String);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número inválido.",
                    "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }

         // Caixa de diálogo para obter o segundo número
        String numero2String = JOptionPane.showInputDialog(null, "Digite o segundo número:",
                "Soma de Números", JOptionPane.QUESTION_MESSAGE);
        if (numero2String == null || numero2String.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Operação cancelada",
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
         int numero2;
        try {
            numero2 = Integer.parseInt(numero2String);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número inválido.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //  Somar os dois números
        int resultado = numero1 + numero2;
        JButton btnResultado = new JButton("A soma é: " + resultado);
        btnResultado.setBackground(Color.WHITE);
        btnResultado.setForeground(Color.BLACK);
        JOptionPane.showMessageDialog(null, btnResultado,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}

// https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html