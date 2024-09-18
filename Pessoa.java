import java.util.Scanner;
public class Pessoa
{
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public Pessoa(String nome, int idade, float peso, float altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    public void mostrarNome()
    {
        System.out.println("Nome: " +nome);
    }
    
    public void mostrarIdade()
    {
        System.out.println("Idade: " +idade);
    }
    
    public void mostrarPeso()
    {
        System.out.println("Peso: " +peso);
    }
    
    public void mostrarAltura()
    {
        System.out.println("Altura: " +altura);
    }
    
    public void calcularIMC(){
        double imc = peso/(altura*altura);
        System.out.println("IMC: "+imc);
        
        if(imc<18.5)
        {
            System.out.println("Abaixo do peso.");
        }
        else if(imc>=18.5 && imc<=24.9)
        {
            System.out.println("Peso normal.");
        }
        else if(imc>=25 && imc<=29.9)
        {
            System.out.println("Acima do peso.");
        }
        else if(imc>=30 && imc<=34.9)
        {
            System.out.println("Obesidade grau 1.");
        }
        else if(imc>=35 && imc<=39.9)
        {
            System.out.println("Obesidade grau 2.");
        }
        else
        {
            System.out.println("Obesidade grau 3");
        }
    }
    
    
    
    
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Lucas", 18, 65, 180);
        Pessoa pessoa2 = new Pessoa("Renato", 19,80, 170);
        pessoa1.mostrarNome();
        pessoa1.mostrarIdade();
        pessoa1.mostrarPeso();
        pessoa1.mostrarAltura();
        pessoa1.calcularIMC();
        pessoa2.mostrarNome();
        pessoa2.mostrarIdade();
        pessoa2.mostrarPeso();
        pessoa2.mostrarAltura();
        pessoa2.calcularIMC();
    }
}



