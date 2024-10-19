
package Trabalho1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Inicialização da estrutura de menu da livraria
        
        System.out.println("[=========DEVS LIBRARY========]");
        System.out.println("1 - [CADASTRO DE LIVROS]");
        System.out.println("2 - [CADASTRO USUÁRIO]");
        System.out.println("3 - [EMPRÉSTIMO]");
        System.out.println("4 - [DEVOLUÇÃO]");
        System.out.println("[=============================]");
        
        System.out.println("Digite o número de acordo com a sua necessidade:");
        int n = scan.nextInt();
        scan.nextLine();
        
        //Protótipo da estrutura de seleção por parte da escolha numérica do usuário
        
        switch (n){
                case 1:
                    System.out.println("[CADASTRO DE LIVROS]\n");
                            
                    System.out.println("Caso você queira cancelar a operação digite 5 ou 6 para cadastrar novamente");
                   
                    ;
                    break;
                case 2:
                    System.out.println("[CADASTRO USUÁRIO]\n");
                    break;
                case 3:
                    System.out.println("[EMPRÉSTIMO]");
                    break;
                case 4:
                    System.out.println("[DEVOLUÇÃO]");
                    break;    
                case 5:
                    break;
        }
    }
}
