
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
                     emprestimo1.emprestar();
                     break;
                 case 2:
                     emprestimo1.devolver();
                     break;
                 case 3: 
                     emprestimo2.emprestar();
                     break;
                 case 4:
                     emprestimo2.devolver();
                     break;
                 case 0:
                     System.out.println("Saindo...");
                 default:
                     System.out.println("Opção inválida"); 
             }       
        } while (opcao!=0);
            
        scanner.close();
          
    }
}
