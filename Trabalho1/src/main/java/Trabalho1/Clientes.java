
package Trabalho1;

public class Clientes {
    
    private String nome;
    private String email;
    private int numeroID;
    
        Clientes(String nome, String email, int numeroID){
            this.nome = nome;
            this.email = email;
            this.numeroID = numeroID;
        }

        public String getNome() {
            return this.nome;
        }
        public String getEmail() {
            return this.email;
        }
        public int getNumeroID() {
            return this.numeroID;
        }
        public String listarCLientes(){
            return "Cliente: " + this.nome;
        }
        

        
        
       
}
