
package Trabalho1;

public class Clientes {
    
    private String nome;
    private String email;
    private int numeroID;
    private int telefone;
    
        //Criação do Construtor
        Clientes(String nome, String email, int numeroID, String telefone){
            this.nome = nome;
            this.email = email;
            this.numeroID = numeroID;
        }
        

        //Criação de gets e listagens
        public String getNome() {
            return this.nome;
        }

        public int getID() {
            return this.numeroID;
        }

        //Método para listagem
        @Override
        public String toString (){
            return "Nome:" + this.nome + " com o ID: " + this.numeroID;
        }

        


        
        
       
}
