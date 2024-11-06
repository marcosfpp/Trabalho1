package Trabalho1;

public class Livros {
    private String nomeLivro;
    private String nomeAutor;
    private int anoPublicacao;
    private int numeroExemplares;
    
    Livros(String nomeLivro, String nomeAutor, int anoPublicacao, int numeroExemplares){
       this.nomeLivro = nomeLivro;
       this.nomeAutor = nomeAutor;
       this.anoPublicacao = anoPublicacao;
       this.numeroExemplares = numeroExemplares;
    }
    
    public boolean verficar(){
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
    public int setDevolverLivros(int numeroExemplares){
        this.numeroExemplares++;
        return 0;
    }
    public String getMostrarDadosStrings(){
        return this.nomeLivro + "\n" + this.nomeAutor;
    }
    public int getMostrarPublicacao(){
        return this.anoPublicacao;
    }
    public int getMostrarExemplares(){
        return this.numeroExemplares;
    }
}
