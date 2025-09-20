
public class Usuario {
    private String nome;
    private int idade;
    private String sexo;
    private Telefone telefone;
    
    public Usuario(String nome, int idade,String sexo, Telefone telefone) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
        
    }
    
    public void lerLivro(String s) {
        System.out.println("Voce esta lendo o livro: " + s );
        
        
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    
    
    
    
    
}
