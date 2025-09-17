
public class Livro {
    private String titulo;
    private String autores;
    private String area;
    private String editora;
    private int ano;
    private int edicao;
    private int numeroFolha;
    private boolean emprestimo;
    
    public Livro(String titulo, String autores, String area, String editor, int ano, int edicao, int numeroFolha, boolean emprestimo) {
        this.titulo = titulo;
        this.autores = autores;
        this.area = area;
        this.editora = editor;
        this.ano = ano;
        this.edicao = edicao;
        this.numeroFolha = numeroFolha;
        this.emprestimo = emprestimo;
        
        
    }
    
    public void abrirLivro() {
        System.out.println("O livro: " + Livro.this.titulo + " esta aberto");
    }
    
    public void fecharLivro() {
        System.out.println("O livro: " + Livro.this.titulo + " esta fechado");
    }

    
    public boolean getEmprestimo() {
        return emprestimo;
    }
    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getNumeroFolha() {
        return numeroFolha;
    }

    public void setNumeroFolha(int numeroFolha) {
        this.numeroFolha = numeroFolha;
    }
    
    
    
    
}
