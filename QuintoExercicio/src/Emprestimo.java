
public class Emprestimo {
    private String dataEmprestimo;
    private Hora horaEmprestimo;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(String dataEmprestimo, Hora horaEmprestimo, Livro livro, Usuario usuario) {
        this.dataEmprestimo = dataEmprestimo;
        this.horaEmprestimo = horaEmprestimo;
        this.livro = livro;
        this.usuario = usuario;
    }
    
    

    public void devolverLivro(String s) {
        livro.setEmprestimo(true);
        System.out.println("Livro: " + livro.getTitulo() + " devolvido");
        System.out.println("Livro esta disponivel: " + livro.getEmprestimo());
    }
    
    public void realizaEmprestio(String dataEmprestimo, Hora horaEmprestimo, Livro livro, Usuario usuario) { {
        this.dataEmprestimo = dataEmprestimo;
        this.horaEmprestimo = horaEmprestimo;
        this.livro = livro;
        this.usuario = usuario;
        livro.setEmprestimo(false);
        System.out.println("Emprestimo realizado");

        
    }
        
    }
    
    public void imprimirEmprestimo() {
        System.out.println("INFORMACOES EMPRESTIMO");
        System.out.println("Data do emprestimo: " + dataEmprestimo);
        System.out.println("Hora do emprestimo: " + horaEmprestimo.getHora()+":" + horaEmprestimo.getMinuto());
        System.out.println("Nome do livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutores());
        System.out.println("Area: " + livro.getArea());
        System.out.println("Editora: " + livro.getEditora());
        System.out.println("Ano: " + livro.getAno());
        System.out.println("Edicao: " + livro.getEdicao());
        System.out.println("Folhas: " + livro.getNumeroFolha());
        System.out.println("Usuario: " + usuario.getNome());
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Hora getHoraEmprestimo() {
        return horaEmprestimo;
    }

    public void setHoraEmprestimo(Hora horaEmprestimo) {
        this.horaEmprestimo = horaEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
    
    
    
    
    
}
