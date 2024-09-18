import java.util.Scanner;

public class senhas
{
    public static void main(String args[])
    {
        int sCaixas=1;  
        ControleAtendimento Caixa1 = new ControleAtendimento(1);
        ControleAtendimento Caixa2 = new ControleAtendimento(2);
        ControleAtendimento Caixa3 = new ControleAtendimento(3);
        ControleAtendimento Caixa4 = new ControleAtendimento(4);
        ControleAtendimento Caixa5 = new ControleAtendimento(5);
        
       
        Scanner sc = new Scanner(System.in);
        
        
        while (sCaixas > 0)
        {
            sCaixas = sc.nextInt();
            
            switch(sCaixas)
            {
                case 1: Caixa1.proximaSenha(); break;
                case 2: Caixa2.proximaSenha(); break;
                case 3: Caixa3.proximaSenha(); break;
                case 4: Caixa4.proximaSenha(); break;
                case 5: Caixa5.proximaSenha(); break;
                default: System.out.println("Caixa inexistente");
            }
        }
    }
}