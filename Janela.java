import javax.swing.JFrame;

public class Main 
{
  public static void main(String[] args)
  {

    JFrame janela = new JFrame();

    janela.setVisible(true);
    janela.setSize(300, 300);
    janela.setTitle("Aula_1");
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Quando clicar no "X" para fechar a janela tbm irá dar stop no codigo
    janela.setResizable(false); // as setas para derimencionar o tamanho da janela somem
    janela.setLocationRelativeTo(null); // para iniciar a janela no centro da tela
  
  }
}
