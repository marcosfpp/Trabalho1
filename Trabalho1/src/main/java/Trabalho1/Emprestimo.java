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
    
    do{ 
        System.out.println("\n--- Menu de Empréstimo de Livros ---");
        System.out.println("1. Emprestar '1984'");
        System.out.println("2. Emprestar 'O Pequeno Gigante'");
        System.out.println("0. Sair");
        System.out.println("Escolha uma opção: ");
        
        opcao = scanner.nextInt();
        
        switch (opcao) {
            
            case 1:
            emprestimo1.emprestar();
                break;
            case 2:
                emprestimo2.emprestar();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
        }
        
        
        
    
    }
}
        
}

    
