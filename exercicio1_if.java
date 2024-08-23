class exercicio1_if
{
    public static void main(String args[])
    {
        
        try
        {
            int num;
            num = Integer.parseInt(args[0]);
            
            if(num % 2 == 0){
                System.out.println("Valor Par"); 
            }
            else{
                System.out.println("Valor Impar");
            }
        }catch (NumberFormatException e){
            System.out.println("Erro: O valor inserido não é um número inteiro");
            e.printStackTrace();
        }
    }
    
}