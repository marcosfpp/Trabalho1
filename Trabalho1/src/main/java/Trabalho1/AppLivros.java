package Trabalho1;

import java.util.Scanner;

public class AppLivros {
    public static void main(String[] args) {
        Livros[] livros = new Livros[5];
        Scanner scan = new Scanner(System.in);
        
        do {
            for(int i = 0; i < livros.length; i++){
                System.out.println("Digite o título do livro: ");
                String nome = scan.nextLine();
                int opcaoMenu;
                
                System.out.println("Digite o opção desejada: ");

                System.out.println("Digite o(s) autor(es) do livro: ");
                String autor = scan.nextLine();

                System.out.println("Digite o ano de publicação: ");
                int anoPubli = scan.nextInt();
                scan.nextLine();

                System.out.println("Digite a quantidade de exemplares disponíveis: ");
                int quantExemplares = scan.nextInt();
                scan.nextLine();

                Livros informacoesLivro = new Livros(nome, autor, anoPubli, quantExemplares);
                livros[5] = informacoesLivro;
            }
        } while(opcaoMenu != 2);
    }
            
}
