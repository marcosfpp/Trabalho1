package Trabalho1;

public class Clientes {
    
    private String nome;
    private String email;
    private String telefone;
    private String numeroID;
    private int qtd_Emprestada;
 

    
        //Criação do Construtor
        Clientes(String nome, String email, String numeroID, String telefone){
            this.nome = nome;
            this.email = email;
            this.numeroID = numeroID;
        }
        

        //Criação de gets e listagens
        
        public String naoEmprestimo(){
            return "Nao foi possivel realizar o emprestimo";
        }
        public int setQuantidadeEmprestimos(int numeroEmprestimo){
            if(this.qtd_Emprestada >= 0 || this.qtd_Emprestada <= 3 ){
                this.qtd_Emprestada = this.qtd_Emprestada + numeroEmprestimo;
            }
            else if (this.qtd_Emprestada > 3){
                naoEmprestimo();
            }
            return 0;
        }
        public int getMostrarQuantidadeEmprestada(){
            return this.qtd_Emprestada;
        }
        public String getEmail() {
            return this.email;
        }

        public String getTelefone() {
            return this.telefone;
        }
        
        public String getNome() {
            return this.nome;
        }
        public String getId() {
            return this.numeroID;
        }

        
        

        //Método para listagem
        @Override
        public String toString (){
            return "Nome:" + this.nome + " com o ID: " + this.numeroID;
        }

        


        
        
       
}
