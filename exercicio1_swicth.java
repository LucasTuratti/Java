class exercicio1_swicth
{
    public static void main(String args[])
    {
        
        try
        {
            int num;
            num = Integer.parseInt(args[0]);
            
            switch(num % 2){
                case 0: System.out.println("Valor Par"); break;
                case 1: System.out.println("Valor Impar"); break;
                default: System.out.println("Numero Desconhecido");
            }
        }catch (NumberFormatException e){
            System.out.println("Erro: O valor inserido não é um número inteiro");
            e.printStackTrace();
        }
    }
    
}