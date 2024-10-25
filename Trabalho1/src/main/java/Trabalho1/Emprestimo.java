package Trabalho1;

public class Emprestimo {
private String livro;
private boolean emprestado;

public Emprestimo(String livro) {
 this.livro = livro;
 this.emprestado = false;

}
 
public void emprestar() {
   if (!emprestado) { 
      emprestado = true;
       System.out.println("Livro " + " emprestado.");
   } else {
       System.out.println("Livro " + livro + " já está emprestado."); 
   }
}
public void devolver() {
   if (emprestado) { 
       emprestado = false;
       System.out.println("Livro " + livro + " devolvido.");
       
   } else {
       System.out.println("Livro " + livro + " não estava emprestado.");
   }
}
 
// Método para verificar se o livro está emprestado
public boolean isEmprestado() {
    return emprestado;
    }
//Método para obter o título do livro
public String getlivro() {
    return livro;
    }


}
    

        
