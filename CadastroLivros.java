package com.mycompany.saf.cristiano;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroLivros {
    
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Livro> livrin = new ArrayList<>();

    public static void menu(){
        int op = 0;
        
        while (op != 3){
            System.out.println("Selecione uma Opção:");
            System.out.printf("[1] Cadastrar Livro\n[2] Exibir Livro\n[3] Sair\n");
            op = input.nextInt();
            
        switch (op) {
            case 1:
                cadastro();
                break;
            case 2:
                for(int i = 0 ; i < livrin.size();i++){
                    System.out.printf("Livro %s: %s\n", i, livrin.get(i).getTitulo());
                }
                System.out.println("Selecione um livro:");
                int livroOp = input.nextInt();
                livrin.get(livroOp).exibirLivro();
                break;
            case 3:
                System.out.print("Finalizando...");
                System.exit(0);
            default:
                System.out.println("OPÇÃO INVÁLIDA!");
                break;     
        }     
        }
    }

    public static void cadastro(){
        System.out.println("Digite o titulo do livro:");
        String titulo = input.next();
        System.out.println("Digite o nome do autor:");
        String autor = input.next();
        System.out.println("Digite o numero de paginas:");
        int paginas = input.nextInt();
        System.out.println("Digite o ISBN do livro:");
        String ISBN = input.next();
        System.out.println("Digite o valor do livro:");
        double valor = input.nextDouble();

        livrin.add(new Livro(titulo, autor, paginas, ISBN, valor));
    }

    public static void main(String[] args) {
        menu();
    }
}
