import java.util.Scanner; /*Esta linha importa a classe Scanner do pacote java.util. A classe Scanner é usada para ler entradas do usuário, como texto ou números, a partir da entrada padrão (normalmente o teclado).*/

public class Main /*Esta linha define uma classe pública chamada Main. Em Java, toda aplicação deve ter uma classe principal que contém o método main, que é o ponto de entrada da aplicação.*/
{
    public static void main(String[] args) /*Este é o método principal que Java usa para iniciar a execução do programa. public significa que o método pode ser acessado de fora da classe. static indica que o método pertence à classe e não a uma instância da classe. void significa que o método não retorna nenhum valor. String[] args é um array de strings que pode conter argumentos passados para o programa na linha de comando, mas neste código não são usados.*/
    {
        Scanner scanner = new Scanner(System.in); /*Aqui, um novo objeto da classe Scanner é criado e associado à variável scanner. Esse objeto é usado para ler entradas do usuário a partir do System.in, que é a entrada padrão (normalmente o teclado).*/
        
        System.out.print("Digite sua Idade: ");/*Este comando exibe a mensagem "Digite sua Idade: " no console sem avançar para uma nova linha. Isso solicita ao usuário que insira sua idade.*/
        int idade = scanner .nextInt();/*Este comando lê um número inteiro da entrada do usuário usando o objeto scanner e o armazena na variável idade.*/
        if (idade >=18)/*Inicia uma estrutura condicional que verifica se o valor da variável idade é maior ou igual a 18.*/
        {
            System.out.println("Você é maior de idade!!!");/*Se a condição do if for verdadeira (ou seja, se a idade for 18 ou mais), esta linha imprime "Você é maior de idade!!!" no console e avança para uma nova linha.*/
        }
        
        else 
        {
         System.out.println("Você ainda não chegou a maioridade.");/*Se a condição do if não for satisfeita, esta linha imprime "Você ainda não chegou a maioridade." no console e avança para uma nova linha.*/
        }
        scanner.close();/*Fecha o objeto scanner para liberar os recursos que ele estava utilizando. É uma boa prática fechar os recursos como Scanner quando eles não são mais necessários.*/
    }
}
