import javax.swing.*; /* Biblioteca para componentes gráficos do Swing */
import java.awt.*;/* Biblioteca para componentes gráficos básicos */
import java.awt.event.ActionEvent; /* Classe para eventos de ação */
import java.awt.event.ActionListener;/* Interface para implementar ações em resposta a eventos */

public class BankApp /*Nome da classe principal do aplicativo bancário */
{ 
    private float saldo = 0.0f; /* privado para promover o encapsulamento que oculta os detalhes internos de uma classe e controlar o acesso aos seus dados.*/

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(BankApp::new); /* Método para executar a criação da interface gráfica em uma thread separada, garantindo a segurança do Swing */
    }
    //criação da janela
    public BankApp() 
    {
        JFrame frame = new JFrame("Banco Digital"); /* Titulo da janela */
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*para dar stop no run do progrma ao fechar a janela*/
        frame.setSize(400, 300); /* tamanho da janela*/
        frame.setLayout(new GridLayout(5, 2)); /* layot da janela no caso 5linhas e 2colunas*/

        JLabel saldoLabel = new JLabel("Seu Saldo: R$ 0.00"); /* rotulo para exebir o saldo da conta att*/
        JTextField valorField = new JTextField(); /* campo de texto para entrada de valores*/
        JButton saqueButton = new JButton("Sacar");
        JButton depositoButton = new JButton("Depositar");
        JButton sairButton = new JButton("Encerrar");

        // resposta att do saque
        saqueButton.addActionListener(e -> 
        { /* 'e ->{...}' Lambda expression para definir a ação a ser executada quando o botão for clicado */
            
           //Bloco try-catch para capturar possíveis exceções de conversão de número.
            try
            {
                float valorSaque = Float.parseFloat(valorField.getText()); /* parseFloat converte para float. */
                if (valorSaque <= saldo) 
                {
                    saldo -= valorSaque;
                    JOptionPane.showMessageDialog(frame, "Saque feito com sucesso!");
                } else 
                    {
                    JOptionPane.showMessageDialog(frame, "Quantidade insuficiente para saque!");
                    }
                saldoLabel.setText(String.format("Seu Saldo: R$ %.2f", saldo)); /* Atualiza o rótulo saldoLabel com o novo saldo.*/
            } catch (NumberFormatException ex) 
                {
                 JOptionPane.showMessageDialog(frame, "Digite um valor válido para o saque.");
                }
        });

        // resposta para ação do botão do deposito
        depositoButton.addActionListener(e -> 
        { /* 'e ->{...}' Lambda expression para definir a ação a ser executada quando o botão for clicado*/
            try 
            {
                float valorDeposito = Float.parseFloat(valorField.getText()); /*Obtém o valor digitado no campo valorField e converte para float.*/
                saldo += valorDeposito;
                JOptionPane.showMessageDialog(frame, "Depósito realizado com sucesso!");
                saldoLabel.setText(String.format("Seu Saldo: R$ %.2f", saldo)); /* linha que att o saldo*/   
            } catch (NumberFormatException ex) 
                {
                 JOptionPane.showMessageDialog(frame, "Digite um valor válido para o depósito.");
                }
        });

        // resposta para ação do botão de sair
        sairButton.addActionListener(e ->
        {
         JOptionPane.showMessageDialog(frame, "Volte Sempre!");
         System.exit(0); /*Encerra o aplicativo. */
        });

        //componentes da janela
        frame.add(saldoLabel);
        frame.add(new JLabel("Valor:"));
        frame.add(valorField);
        frame.add(saqueButton);
        frame.add(depositoButton);
        frame.add(sairButton);
        frame.setVisible(true);
    }
}
