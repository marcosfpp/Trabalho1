package Trabalho1;

public class Livros {
    private int idLivro; 
    private String nomeLivro;
    private String nomeAutor;
    private int anoPublicacao;
    private int numeroExemplares;
    
    Livros(int id, String nomeLivro, String nomeAutor, int anoPublicacao, int numeroExemplares){
       this.idLivro = id;
       this.nomeLivro = nomeLivro;
       this.nomeAutor = nomeAutor;
       this.anoPublicacao = anoPublicacao;
       this.numeroExemplares = numeroExemplares;
    }
    
    public boolean verificarDisponibilidade(){
        return this.numeroExemplares > 0;
    }
    public int setPegarlivro(int quantidade){
        if (this.numeroExemplares >= quantidade){
            this.numeroExemplares -= quantidade;
        }
        else {
            System.out.println("Quantidade de exemplares indisponível");
        }
        return 0;
    }
    public int setDevolverLivros(int quantidadeDevolvida){
        this.numeroExemplares = this.numeroExemplares + quantidadeDevolvida;
        return 0;
    }
    public int getMostrarIdLivro(){
        return this.idLivro;
    }
    public String getMostrarNome(){
        return this.nomeLivro;
    }
    public String getMostrarAutor(){
        return this.nomeAutor;
    }
    public int getMostrarPublicacao(){
        return this.anoPublicacao;
    }
    public int getMostrarExemplares(){
        return this.numeroExemplares;
    }
    @Override
    public String toString(){
        return "Id: " + this.idLivro + "\n" +
               "Nome: " + this.nomeLivro + "\n" +
               "Autor(es): " + this.nomeAutor + "\n" +
               "Quantiddade de paginas: " + this.anoPublicacao + "\n" +
               "Numero de exemplares: " + this.numeroExemplares + "\n";
    }
    
}
