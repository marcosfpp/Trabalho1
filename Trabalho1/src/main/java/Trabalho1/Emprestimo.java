package Trabalho1;

public class Emprestimo {
    
private Clientes usuario;
private Livros livro;
private String dataEmprestimo;
private String dataDevolucao;
private boolean emprestimoAtivo;

//Construtor principal para empréstimos ativos
public Emprestimo(Livros livro, String dataEmprestimo, Clientes usuario) {
    this.usuario = usuario;
    this.livro = livro;
    this.dataEmprestimo = dataEmprestimo;
    this.emprestimoAtivo = true;
    this.usuario.setQuantidadeEmprestimos(1);
}

//Construtor secundário para empréstimos inativos ou apenas para consultar
public Emprestimo(Livros livro, String dataEmprestimo, String dataDevolucao) {
    this.livro = livro;
    this.dataEmprestimo = dataEmprestimo;
    this.dataDevolucao = dataDevolucao;
    this.emprestimoAtivo = false;
}

//Getters
public Livros getLivro() {
    return this.livro;
}

public Clientes getUsuario() {
    return this.usuario;
}

public String getDataEmprestimo() {
    return this.dataEmprestimo;
}

public String getDataDevolucao() {
    return this.dataDevolucao;
}

public boolean isEmprestimoAtivo() {
    return this.emprestimoAtivo;
}
//setters 
public void setDataEmprestimo(String dataEmprestimo) {
    this.dataEmprestimo = dataEmprestimo;
}
public void setDataDevolucao(String dataDevolucao) {
    this.dataDevolucao = dataDevolucao;
}
public void finalizarEmprestimo() {
    this.emprestimoAtivo = false;
}
//Métodos de empréstimo
public void realizarEmprestimo() {
    this.livro.setPegarlivro(1);
}

public void verificarDisponibilidade() {
    this.livro.verificarDisponibilidade();
}

//Métodos de devolução
public void devolverLivro() {
    this.livro.setDevolverLivros(1);
}

//Representação textual do empréstimo
@Override 
public String toString() {
    return "Usuário: " + this.usuario.getNome() + "\n" +
               "ID do Usuário: " + this.usuario.getId() + "\n" +
               "Codigo livro: " + this.livro.getMostrarIdLivro() +
               "Livro: " + this.livro.getMostrarNome() + "\n";
    }
}