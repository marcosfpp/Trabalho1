package Trabalho1;

public class Livros {
    private String nomeLivro;
    private String nomeAutor;
    private String anoPublicacao;
    private int numeroExemplares;
    
    Livros(String nomeLivro, String nomeAutor, String anoPublicacao, int numeroExemplares){
       this.nomeLivro = nomeLivro;
       this.nomeAutor = nomeAutor;
       this.anoPublicacao = anoPublicacao;
       this.numeroExemplares = numeroExemplares;
    };
    
    public int setPegarlivro(int numeroExemplares){
        this.numeroExemplares--;
    };
    public int setDevolverLivros(int numeroExemplares){
        this.numeroExemplares++;
    }; 
    
}
