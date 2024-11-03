package Trabalho1;

public class Emprestimo {
    
private BibliUsuario usuario;
private BibliLivro livro;
private String dataEmprestimo;
private String dataDevolucao;
private boolean emprestimoAtivo;

//Construtor principal para empréstimos ativos
public Emprestimo(BibliLivro livro, String dataEmprestimo, BibliUsuario usuario) {
    this.usuario = usuario;
    this.livro = livro;
    this.dataEmprestimo = dataEmprestimo;
    this.emprestimoAtivo = true;
    this.usuario.setQuantidadeEmprestimos(1);
}

//Construtor secundário para empr[estimos inativos ou apenas para consultar
public Emprestimo(BibliLivro livro, String dataEmprestimo, String dataDevolucao) {
    this.livro = livro;
    this.dataEmprestimo = dataEmprestimo;
    this.dataDevolucao = dataDevolucao;
    this.emprestimoAtivo = false;
}

//Getters
public BibliLivro getLivro() {
    return this.livro;
}

public BibliUsuario getUsuario() {
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
