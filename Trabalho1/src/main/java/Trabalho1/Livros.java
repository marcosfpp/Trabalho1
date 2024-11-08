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
        if (this.numeroExemplares != 0){
            return true;
        }else {
            return false;
        }
    }
    public int setPegarlivro(int numeroExemplares){
        if (this.numeroExemplares >= 0){
            System.out.println("Não possui exemplares disponíveis.");
        }
        else {
            this.numeroExemplares--;
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
        return "Nome: " + this.nomeLivro + "\n" +
               "Autor(es)" + this.nomeAutor + "\n" +
               "Quantiddade de paginas: " + this.anoPublicacao + "\n" +
               "Numero de exemplares" + this.numeroExemplares + "\n";
    }
    
}
