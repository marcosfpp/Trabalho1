
package Trabalho1;

import static Trabalho1.AppClientes.menu;
import java.util.Scanner;


public class App {
    public static void menu() {
        System.out.println("[=========DEVS LIBRARY========]");
        System.out.println("1 - [CADASTRO DE LIVROS]\n");
        System.out.println("2 - [CADASTRO USUÁRIO]\n");
        System.out.println("4 - [LISTAGEM DE USUÁRIOS]\n");
        System.out.println("4 - [LISTAGEM DE LIVROS]\n");
        System.out.println("3 - [EMPRÉSTIMO]\n");
        System.out.println("4 - [DEVOLUÇÃO]\n");
        System.out.println("5 - [SAIR]\n");
        System.out.println("[=============================]");

    }
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        menu();
        System.out.println("Escolha a opção desejada: ");
        int opc = scan.nextInt();

        while (opc != 5) {
            switch (opc) {
                case 1:
                    System.out.println("[CADASTRO DE LIVROS]\n");      
                    System.out.println("Caso você queira cancelar a operação digite 5 ou 6 para cadastrar novamente");
                    break;
                case 2:
                    System.out.println("[CADASTRO USUÁRIO]\n");
                    break;
                case 3:
                     try {
                        // Contador de empréstimos 
                        int qtdEmprestimos = 0;
                        
                    }
                        // Entrada de usuário
                        String escolha;
                        int idUsu;
                        int codigo_e;
                        String dataDeEmp;
                        
                        // Arrays para armazenar objetos do sistema
                        Clientes[] clientes = new Clientes[100];  // Array de usuários 
                        Livros[] livros = new Livros[100];       // Array de livros
                        Emprestimo[] emprestimos = new Emprestimo[100]; //Array de empréstimos 
                        
                    }
                      boolean ClienteEncontrado = false;
                      boolean livroEncontrado = false;
                      boolean livroJaEmprestado = false;
                      boolean possuiEmprestimoMaximo = false;
                      
                        System.out.println("==========================="); 
                        System.out.println("          EMPRÉSTIMO      ");
                        System.out.println("===========================");
                        
                        System.out.println("Deseja pegar um livro emprestado? (s/n): ");
                        escolha = scan.next().trim().toLowerCase();
                        scan.nextLine();
                        
                        while (escolha.equals("sim"))
                        
                        
                        for (Clientes clientes : Clientes) {
                            if (clientes != null && clientes.getId() == idUsu)
                                possuiEmprestimoMaximo = clientes.getQuantidadeEmprs() >= 3;
                                break;
                            }
                        }
                            if (!usuarioEncontrado) {
                                System.out.println("Usuário não cadastrado!");
                            } else if (possuiEmprestimoMaximo) {
                                System.out.println("Este usuário já possui 3 empréstimos ativos. Devolva pelo menos 1 livro antes de pegar outro.");
                            } else {
                                System.out.println("Informe o código do livro que deseja pegar emprestado: ");
                                codigo_e = scan.nextInt();
                                scan.nextLine();
                                
                    break;
        }
                case 4:
                    System.out.println("Deseja fazer a devolução de um livro: (S ou N)");
                    String opc_sec = scan.nextLine();
                    if (opc_sec == "S") {
                        System.out.println("Digite o código do livro que deseja devolver");
                    }
                    
                    
                   
                    break;    
                case 5:

        }
    }
}
