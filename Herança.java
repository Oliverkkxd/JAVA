//inicia a classe
public class Main{
    //inicia o metodo
    public static void main(String[]args){
        
        //cria o objeto
        Gato g1 = new Gato();
        //adiciona atributos
        g1.nome = "GARFIELD";
        g1.peso = 8;
        g1.idade = 5;
        g1.dados();
        g1.mia();
        
        System.out.println(" ");
        System.out.println("--------------------------");
        System.out.println(" ");
        
        //cria o objeto
        Cachorro c1 = new Cachorro();
        //adiciona atributos
        c1.nome = "DogCoin";
        c1.peso = 8;
        c1.idade = 5;
        c1.dados();
        c1.latir();
        
    }
}

//CLASSE SUPREMA
class Animal{
    String nome;
    float peso;
    int idade;
    void dados(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
    }
}

//SUBCLASSE
class Gato extends Animal{
    void mia(){
        System.out.println("miando");
    }
}

//SUBCLASSE
class Cachorro extends Animal{
    String latir;
    void latir(){
        System.out.println("Gerando Crypto");
    }
}
