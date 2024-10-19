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
    
    public boolean verficarDisponibidade(){
        if (this.numeroExemplares != 0){
            return true;
        }
    }
    public int setPegarlivro(int numeroExemplares){
        if (this.numeroExemplares >= 0){
            System.out.println("Não possui exemplares disponíveis.");
        }
        else {
            this.numeroExemplares--;
        }
    }
    public int setDevolverLivros(int numeroExemplares){
        this.numeroExemplares++;
    }
    public String getMostrarDadosStrings(){
        return this.nomeLivro + this.nomeAutor;
    }
    public int getMostrarDadosInt(){
        return this.anoPublicacao + this.numeroExemplares;
    }
}
