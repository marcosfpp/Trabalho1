
package Trabalho1;

import java.util.Scanner;

public class AppClientes {
    
        //criação de função menu
        public static void menu(){
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
            
            //acesso ao menu
            menu();
            System.out.println("Escolha a opção desejada: ");
            int opc = scan.nextInt();
            
            
            while (opc != 5) {
                switch(opc){
                    
                    case 1: 
                    
                    
                    
                    
                }
                
            }
            

            //Protótipo da estrutura de seleção por parte da escolha numérica do usuário

        }

}