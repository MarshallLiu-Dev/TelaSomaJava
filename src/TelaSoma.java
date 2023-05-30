// exemplo 1 


// import javax.swing.JOptionPane;

// public class TelaSoma {
//     public TelaSoma(String string) {
//     }

//     public static void main(String[] args) {
//         // Caixa de diálogo para obter o primeiro número
//         String numero1String = JOptionPane.showInputDialog(null, "Digite o primeiro número:",
//                 "Soma de Números", JOptionPane.QUESTION_MESSAGE);

//         // Verificar se o usuário cancelou ou deixou em branco
//         if (numero1String == null || numero1String.trim().isEmpty()) {
//             JOptionPane.showMessageDialog(null, "Operação cancelada ou número inválido.",
//                     "Erro", JOptionPane.ERROR_MESSAGE);
//             return;
//         }

//         // Converter o primeiro número para um valor inteiro
//         int numero1;
//         try {
//             numero1 = Integer.parseInt(numero1String);
//         } catch (NumberFormatException e) {
//             JOptionPane.showMessageDialog(null, "Número inválido.",
//                     "Erro", JOptionPane.ERROR_MESSAGE);
//             return;
//         }

//         // Caixa de diálogo para obter o segundo número
//         String numero2String = JOptionPane.showInputDialog(null, "Digite o segundo número:",
//                 "Soma de Números", JOptionPane.QUESTION_MESSAGE);

//         // Verificar se o usuário cancelou ou deixou em branco
//         if (numero2String == null || numero2String.trim().isEmpty()) {
//             JOptionPane.showMessageDialog(null, "Operação cancelada ou número inválido.",
//                     "Erro", JOptionPane.ERROR_MESSAGE);
//             return;
//         }

//         // Converter o segundo número para um valor inteiro
//         int numero2;
//         try {
//             numero2 = Integer.parseInt(numero2String);
//         } catch (NumberFormatException e) {
//             JOptionPane.showMessageDialog(null, "Número inválido.",
//                     "Erro", JOptionPane.ERROR_MESSAGE);
//             return;
//         }

//         // Somar os dois números
//         int resultado = numero1 + numero2;

//         // Exibir o resultado em uma caixa de diálogo
//         JOptionPane.showMessageDialog(null, "A soma é: " + resultado,
//                 "Resultado", JOptionPane.INFORMATION_MESSAGE);
//     }
// }


// exemplo 2



// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class TelaSoma extends JFrame implements ActionListener {
//     private JTextField txtNumero1;
//     private JTextField txtNumero2;
//     private JButton btnSomar;
//     private JLabel lblResultado;

//     public TelaSoma(String nome) {
//         super(nome);
//         this.setBounds(100, 100, 400, 200);
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setLayout(new FlowLayout());

//         JLabel lblNumero1 = new JLabel("Número 1:");
//         this.add(lblNumero1);

//         txtNumero1 = new JTextField(10);
//         this.add(txtNumero1);

//         JLabel lblNumero2 = new JLabel("Número 2:");
//         this.add(lblNumero2);

//         txtNumero2 = new JTextField(10);
//         this.add(txtNumero2);

//         btnSomar = new JButton("Somar");
//         btnSomar.addActionListener(this);
//         btnSomar.setBackground(Color.GREEN);
//         btnSomar.setForeground(Color.WHITE);
//         this.add(btnSomar);

//         lblResultado = new JLabel("Resultado: ");
//         this.add(lblResultado);

//         this.setVisible(true);
//     }

//     public void actionPerformed(ActionEvent e) {
//         try {
//             int num1 = Integer.parseInt(txtNumero1.getText());
//             int num2 = Integer.parseInt(txtNumero2.getText());
//             int resultado = num1 + num2;
//             lblResultado.setText("Resultado: " + resultado);
//         } catch (NumberFormatException ex) {
//             JOptionPane.showMessageDialog(this, "Digite valores numéricos válidos", "Erro", JOptionPane.ERROR_MESSAGE);
//         }
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> {
//             TelaSoma tela = new TelaSoma("Calculadora");
//         });
//     }
// }


// exemplo 3 


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSoma extends JFrame implements ActionListener {
    public TelaSoma(String string) {
    }

    public static void main(String[] args) {
        // Caixa de diálogo para obter o primeiro número
        String numero1String = JOptionPane.showInputDialog(null, "Digite o primeiro número:",
                "Soma de Números", JOptionPane.QUESTION_MESSAGE);

        // Verificar se o usuário cancelou ou deixou em branco
        if (numero1String == null || numero1String.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Operação cancelada ou número inválido.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Converter o primeiro número para um valor inteiro
        int numero1;
        try {
            numero1 = Integer.parseInt(numero1String);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número inválido.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Caixa de diálogo para obter o segundo número
        String numero2String = JOptionPane.showInputDialog(null, "Digite o segundo número:",
                "Soma de Números", JOptionPane.QUESTION_MESSAGE);

        // Verificar se o usuário cancelou ou deixou em branco
        if (numero2String == null || numero2String.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Operação cancelada ou número inválido.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Converter o segundo número para um valor inteiro
        int numero2;
        try {
            numero2 = Integer.parseInt(numero2String);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número inválido.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Somar os dois números
        int resultado = numero1 + numero2;

        // Criar um botão personalizado
        JButton btnResultado = new JButton("A soma é: " + resultado);
        btnResultado.setBackground(Color.WHITE);
        btnResultado.setForeground(Color.BLACK);

        // Exibir o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, btnResultado,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
