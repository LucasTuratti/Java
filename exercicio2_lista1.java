class exercicio2_lista1
{
    public static void main(String args[])
    {
        try
        {
            float num;
            num = Float.parseFloat(args[0]);
            
            if(num >= 0)
            {
                System.out.println("Positivo");
            }
            else
            {
                System.out.println("Negativo");
            }
            
        }catch (NumberFormatException e){
            System.out.println("Não é número");
            e.printStackTrace();
        }
    }
    
}