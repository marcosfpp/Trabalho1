
package Trabalho1;

import java.util.Scanner; // Import de variavéis.

public class AppEmprestimo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Criando instâncias de Emprestimo para diferentes livros.
        //Criando classes construtoras
        Emprestimo emprestimo1 = new Emprestimo("1984");
        Emprestimo emprestimo2 = new Emprestimo("O pequeno Príncipe");
        
        int opcao; //Variável de verificação 
        
        do { 
            System.out.println("\n--- Menu de Empréstimo de Livros ---");
            System.out.println("1. Emprestar '1984'");
            System.out.println("2. Devolver '1984'");
            System.out.println("3. Emprestar 'O Pequeno Príncipe'");
             System.out.println("4. Devolver 'O Pequeno Príncipe'");
             System.out.println("0. Sair");
             System.out.println("Escolha uma opção: ");
             
             opcao = scanner.nextInt();
            
             // testar supostos casos.
             switch (opcao) {
                 case 1: 
                    
        }
            
          
    }
}
