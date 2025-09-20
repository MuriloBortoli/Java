
public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;
    
    public Funcionario(String nom, String dep, double sal, String dat, String r){
        nome = nom;
        departamento = dep;
        salario = sal;
        dataEntrada = dat;
        rg = r;
        
    }
    
    

    public void setAumento(double m) {
        this.salario += m;
        
        
    }
    
 
    
    public double calculaGanhoAnual() {
        return salario * 12;
        
          
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    
    
    

    
    public String getNome() {
        return nome;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public String getDataEntrada() {
        return dataEntrada;
    }
    
    public String getRg() {
        return rg;
    }
   
    
}
