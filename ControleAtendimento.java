public class ControleAtendimento {
    
    private static int numSenha;
    private int numCaixa;  
    
     
    ControleAtendimento(int caixa) {
        numCaixa = caixa;
        numSenha = 0;
        System.out.println("Caixa " + numCaixa + " iniciou operação");
    }
    
    public void proximaSenha() {
        numSenha++;
        System.out.println("Cliente com a senha número " + numSenha + " deve dirigir-se ao caixa número " + numCaixa);
    }
}
