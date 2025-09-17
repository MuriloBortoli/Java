
public class Aplicacao {
    public static void main(String[] args) {
        
        
        Funcionario murilo = new Funcionario("Murilo", "Informatica", 1200.0, "09/09/2025", "1409561");
        
        System.out.println("Funcionario: " + murilo.getNome());
        
        System.out.println("Departamento: " + murilo.getDepartamento());
        
        System.out.println("Salario atual: " + murilo.getSalario());
        
        System.out.println("Data de entrada: " + murilo.getDataEntrada());
        
        System.out.println("RG: " + murilo.getRg());
        
        System.out.println("Seu ganho anual: " + murilo.calculaGanhoAnual());
        
        murilo.setAumento(100);
        
        System.out.println("Com o aumento, seu salario ficou: " + murilo.getSalario() + " E seu ganhou anual: " + murilo.calculaGanhoAnual());
        
        

        
       
    }
    
}
