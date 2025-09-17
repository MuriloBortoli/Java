
public class Aplicacao {
    public static void main(String[] args) {
        
        Porta door = new Porta(true, "verde", 2.0, 2.1, 2.2);
        
        System.out.println("Aberta: " + door.isAberta() + "\nCor: " + door.getCor() +"\nDimensao x: " + door.getDimensaoX());
        
        door.fecha();
        System.out.println("Aberta: " + door.isAberta());
        
        door.abre();
        System.out.println("Aberta: " + door.isAberta());
        
        door.pinta("amarelo");
        System.out.println("A nova cor: " + door.getCor());
        
        door.fecha();
        System.out.println("Ta aberta: " + door.estaAberta());
        
        door.pinta("Vermelho");
        System.out.println("A nova cor: " + door.getCor());
        
        
        
        
        
    }
    
}
