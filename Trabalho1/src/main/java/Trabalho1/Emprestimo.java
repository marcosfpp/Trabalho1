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
 // Método para emprestar sem data específica (assume a data de hoje)
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
       dataDevolucao = LocalDate.now();
       System.out.println("Livro " + livro + " devolvido em " + dataDevolucao + ".");
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
//Método para obter a data de empréstimo
public LocalDate getDataEmprestimo() {
return dataEmprestimo;
}
//Método para obter a data de devolução 
public LocalDate getDataDevolucao() {
    return dataDevolucao;
}

}
    

        
