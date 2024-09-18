public class Conta{
    private final int numeroconta;
    private String nome;
    private float saldo;
    
    public Conta(int numeroconta, String nome, float saldo){
        
        this.numeroconta = numeroconta;
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome do dono da conta não pode ser vazio.");
        }
        this.nome = nome;
        if(saldo>0){
            this.saldo=0;
            this.saldo = saldo;
        }
    }
    
}