package Trabalho1;

public class Clientes {
    
    private String nome;
    private String email;
    private int telefone;
    private int numeroID;
    private int qtd_Emprestada;
 

    
        //Criação do Construtor
        Clientes(String nome, String email, int numeroID, int telefone){
            this.nome = nome;
            this.email = email;
            this.numeroID = numeroID;
        }
        

        //Criação de gets e listagens
        
        public String naoEmprestimo(){
            return "Nao foi possivel realizar o emprestimo";
        }
        public void setQuantidadeEmprestimos(int quantidade){
            this.qtd_Emprestada += quantidade;
        }
        public void setDiminuirQuantidade(int quantidade){
            this.qtd_Emprestada -= quantidade;
        }
        public int getMostrarQuantidadeEmprestada(){
            return this.qtd_Emprestada;
        }
        public String getEmail() {
            return this.email;
        }

        public int getTelefone() {
            return this.telefone;
        }
        
        public String getNome() {
            return this.nome;
        }
        public int getId() {
            return this.numeroID;
        }

        
        

        //Método para listagem
        @Override
        public String toString (){
            return "Nome:" + this.nome +"\n" +
                    "ID: " + this.numeroID + "\n" +
                    "E-mail :" + this.email + "\n" +
                    "Contato: " + this.telefone;
        }

        


        
        
       
}
