public class Main {
    public static void main( String[] args){

        new Janela();
    }   
}








---------------------------------

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela {    
    //metodo construtor
    public Janela(){   
        //Criando o obj
        JFrame jframe = new JFrame();
        
        jframe.setVisible(true);
        jframe.setSize(300, 300);
        jframe.setTitle("Aula_1");
        jframe.setResizable(false);
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(null); // deixa o layout limpo para criar botoes


        // texto simples
        JLabel login = new JLabel("Login: ");

        //X,Y (Largura e Altura)
        login.setBounds(10, 10, 300, 30);
        jframe.add(login);

        // caixa para digitar
        JTextField caixa_login = new JTextField();
        caixa_login.setBounds(60,10,210,30);
        jframe.add(caixa_login);
        
        // texto simples
        JLabel senha = new JLabel("senha: ");

        //X,Y (Largura e Altura)
        senha.setBounds(10, 50, 300, 30);
        jframe.add(senha);

        // caixa para digitar
        JTextField caixa_senha = new JTextField();
        caixa_senha.setBounds(60,50,210,30);
        jframe.add(caixa_senha);

        JLabel esenha = new JLabel("Esqueci minha senha! ");
        esenha.setBounds(80, 100, 100, 30);
        jframe.add(esenha);
    }
}
