
public class Aplicacao {
    public static void main(String[] args) {
        Livro livroLivro = new Livro("Noites Brancas", "Fidor Dostoievsk", "Romance", "Editor 34", 1948, 1, 96, true);
        Telefone telefone = new Telefone(44, 999539802);
        Usuario usuario = new Usuario("Murilo", 19, "Masculino", telefone);
        Hora horaEmprestimo = new Hora(22, 37);
        Emprestimo emprestimo = new Emprestimo("17/09/2025", horaEmprestimo, livroLivro, usuario);
        
        emprestimo.realizaEmprestio("17/09/2025", horaEmprestimo, livroLivro, usuario);
        
        
        emprestimo.imprimirEmprestimo();
        
        livroLivro.fecharLivro();
        livroLivro.abrirLivro();
        
        usuario.lerLivro(livroLivro.getTitulo());
        
        
        emprestimo.devolverLivro(livroLivro.getTitulo());
        
        
        
        
        
        
        
        
        
    }
    
}
