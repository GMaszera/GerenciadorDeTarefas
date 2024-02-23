package org.example;


import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("pt", "BR");
        Locale.setDefault(locale);

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: "); String user = sc.next();






        System.out.println("GERENCIADOR DE TAREFAS");
        System.out.println("A - CRIAR NOVA TAREFA");
        System.out.println("B - LISTAR TAREFAS DE"+user);
        System.out.println("C - MARCAR TAREFA COMO CONCLUIDA");
        System.out.println("D - EXCLUIR TAREFA");

        System.out.print("Selecione a função: "); char function = sc.next().charAt(0);
    }
}
