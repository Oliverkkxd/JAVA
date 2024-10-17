//Criando a class bolo
class Bolo {
    String sabor;
    boolean recheio;
    //Método
    void informacoes(){
        System.out.println(sabor);
        System.out.println(recheio);
    }
}
//Onde o java inicia, não precisa ser o primeiro bloco de codigo.
public class main{
    public static void main (String[] args){
        
        Bolo bolo1 = new Bolo();
        bolo1.sabor = "Laranja";
        bolo1.recheio = true;
        
        bolo1.informacoes();
    }
}
