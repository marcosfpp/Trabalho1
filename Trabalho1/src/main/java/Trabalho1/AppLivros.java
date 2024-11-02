package Trabalho1;

import java.util.Scanner;

public class AppLivros {
    public static void main(String[] args){
        Livros[] livros = new Livros[2];
        Scanner scan = new Scanner(System.in);
        int opcaoMenu = 0 ;
        
        while (opcaoMenu != 3){
                System.out.println("Biblioteca dos DEV's");
                System.out.println("1 - Cadastro de livros \n2 - Mostrar livros \n3 - Sair ");
                System.out.println("Digite o opção desejada: ");
                opcaoMenu = scan.nextInt();
                scan.nextLine();
                
                switch(opcaoMenu){
                    case 1:
                        for (int i = 0; i < 50; i++){
                            System.out.println("\n");
                        }
         
                        for(int i = 0; i < livros.length; i++){                            
                            System.out.println("Digite o título do livro: ");
                            String nome = scan.nextLine();
                            System.out.println("\n");

                            System.out.println("Digite o(s) autor(es) do livro: ");
                            String autor = scan.nextLine();
                            System.out.println("\n");

                            System.out.println("Digite o ano de publicação: ");
                            int anoPubli = scan.nextInt();
                            scan.nextLine();
                            System.out.println("\n");

                            System.out.println("Digite a quantidade de exemplares disponíveis: ");
                            int quantExemplares = scan.nextInt();
                            scan.nextLine();
                            System.out.println("\n");
                    
                            Livros informacoesLivro = new Livros(nome, autor, anoPubli, quantExemplares);
                            livros[i] = informacoesLivro;
                            
                            System.out.println("\n\n");
                        }
                        for (int i = 0; i < 50; i++){
                            System.out.println("\n");
                        }
                        break;
                    
                    case 2:
                        for (int i = 0; i < livros.length; i++){
                            System.out.println("\n"+ livros[i].getMostrarDadosStrings() +"\n" + livros[i].getMostrarPublicacao() +"\n" + livros[i].getMostrarExemplares());
                        }     
                    case 3:
                        System.out.println("Obrigado por usar nosso sistema!");
                       break;
                    default: 
                        System.out.println("Digite uma opção válida! ");
                        break; 
                }
        for (int i = 0; i < 50; i++){
            System.out.println("\n");
        }
        } 
    }
            
}
