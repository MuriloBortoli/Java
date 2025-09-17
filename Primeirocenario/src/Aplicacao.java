
public class Aplicacao {
    public static void main(String[] args) {
        Conta murilo = new Conta("Murilo", 19, 2);
        
        System.out.println("Seu nome: " + murilo.getNome());
        System.out.println("O numero da sua conta: " + murilo.getNumeroConta());
        System.out.println("O seu saldo: " + murilo.getSaldo());

        
        murilo.sacar(50);
        
        murilo.depositar(200);
        
        
        

        
                
       
        
        
    }
    
}
