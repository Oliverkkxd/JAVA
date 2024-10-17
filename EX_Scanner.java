//Importando Biblioteca de entrada de dados
import java.util.Scanner;

//Classe principal sendo publicada
public class Main {
    //Método que inica o java
    public static void main(String[] args) {
        //Instancia de entrada de dados
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        //Armazena o que o usuario digita
        int n1 = scanner.nextInt();
    
        //Armazena o que o usuario digita
        System.out.println("Digite outro numero: ");
        int n2 = scanner.nextInt();

        //resultado da operação
        System.out.println("O resultado é: " + (n1*n2));

        //Encerrar a entrada de dados
        //Util para memoria e processammento
        scanner.close();


        // Pega o O numero da variavel n1 e multiplica por 2
        //System.out.print("O dobro do numero digitado: ");
        //System.out.println(n1*2);

    }
}
