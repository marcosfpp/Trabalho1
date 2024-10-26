package Trabalho1;

import java.time.LocalDate;


public class Emprestimo {
private String livro;
private boolean emprestado;
private LocalDate dataEmprestimo;
private LocalDate dataDevolucao;

public Emprestimo(String livro) {
 this.livro = livro;
 this.emprestado = false;

}
 
public void emprestar() {
   if (!emprestado) { 
      emprestado = true;
      dataEmprestimo = LocalDate.now();
       System.out.println("Livro " + livro + " emprestado em " + dataEmprestimo + ".");
   } else {
       System.out.println("Livro " + livro + " já está emprestado."); 
   }
}
// Sobrecarga do método emprestar para especificar uma data de empréstimo.
public void emprestar(LocalDate data) {
if (!emprestado) {
    emprestado = true;
    dataEmprestimo = data;
    System.out.println("Livro " + livro + " emprestado em " + dataEmprestimo + ".");
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
    

        
