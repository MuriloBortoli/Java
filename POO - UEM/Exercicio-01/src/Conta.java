
public class Conta {
    private String nome;
    private int numeroconta;
    private double saldo;
    
    public Conta (String n, int num, double sal) {
        nome = n;
        numeroconta = num;
        saldo = sal;
    }
    
    public double sacar(double valorSaque){
        if (valorSaque <= saldo){
            saldo -= valorSaque;
            System.out.println("Voce sacou :" + valorSaque);
            System.out.println("Seu saldo atual: " + saldo);
        }
        else {
            System.out.println("Ops: seu saldo e menor que o valor de saque!");
        
        }
        return 0;
    }
    
    public double depositar(double valorDeposito){
        System.out.println("Voce esta depositando: " + valorDeposito);
        System.out.println("Seu saldo atual :" + (saldo + valorDeposito));
        return 0;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getNumeroConta() {
        return numeroconta;
    }
    
 
    
    

    
        
    
    
}
