
package Trabalho1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Inicialização da estrutura de menu da livraria
        System.out.println("<========DEVS LIBRAY========>");
        System.out.println("1 - CADASTRO DE LIVROS");
        System.out.println("2 - CADASTRO USUÁRIO");
        System.out.println("3 - EMPRÉSTIMO");
        System.out.println("4 - DEVOLUÇÃO");
        System.out.println("<===========================>");
        
        System.out.println("Digite o número de acordo com a sua necessidade:");
        int n = scan.nextInt();
        scan.nextLine();
    }
}
