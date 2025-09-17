
public class Aplicacao {
    public static void main(String[] args) {
        Porta portaSala = new Porta("verde", true);
        Porta portaSuite = new Porta("amarela", false);
        Porta portaCozinha = new Porta("azul", true);
        
        Casa sobrado = new Casa("vermelha", portaSala, portaSuite, portaCozinha);
        
        System.out.println("A cor da casa: " + sobrado.getCorCasa());
        
        System.out.println("A cor da porta da sala: " + portaSala.getCor());
        
        System.out.println("A cor da porta da suite: " + portaSuite.getCor());
        
        System.out.println("A cor da porta da cozinha: " + portaCozinha.getCor());
        System.out.println("A cor da porta da cozinha " + portaCozinha.pinta("roxa"));
  
        

        

        System.out.println(sobrado.quantasEstaoAbertas());
        portaSala.fechar();
        portaSuite.fechar();
        portaCozinha.fechar();
        System.out.println(sobrado.quantasEstaoAbertas());
        portaSala.abrir();
        System.out.println(sobrado.quantasEstaoAbertas());
        
        
        
        
        
        
    }
 
}
