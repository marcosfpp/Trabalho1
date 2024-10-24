package Trabalho1;

import java.util.Scanner;

public class Emprestimo {
String livro;
boolean emprestado;

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
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Criando dois empréstimos de livros
    Emprestimo emprestimo1 = new Emprestimo("1984");
    Emprestimo emprestimo2 = new Emprestimo("O pequeno Gigante");
    
    int opcao;
}

}
