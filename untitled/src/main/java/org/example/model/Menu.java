package org.example.model;

import org.example.model.entities.ConsoleCleaner;
import org.example.model.entities.functions.CreateATask;
import org.example.model.entities.functions.ListTasks;

import java.util.Scanner;

public class Menu {

    public static void mainMenu() {
        ConsoleCleaner b = new ConsoleCleaner();
        Scanner sc = new Scanner(System.in);

        //Menu Genérico
        System.out.println("GERENCIADOR DE TAREFAS");
        System.out.println("1 - CRIAR NOVA TAREFA");
        System.out.println("2 - LISTAR TAREFAS");
        System.out.println("3 - MARCAR TAREFA COMO CONCLUIDA");
        System.out.println("4 - EXCLUIR TAREFA");

        System.out.print("Selecione a função: ");
        int function = sc.nextInt();

        switch (function) {
            case 1:
                b.cCleaner();
                System.out.println("Insira o nome de sua tarefa: ");
                System.out.print("Qual o titulo da sua criação: ");
                String title = sc.next();
                System.out.print("Text: ");
                String text = sc.next();
                CreateATask createATask = new CreateATask(title);
                createATask.setTexto(text);
                createATask.openTask();

                break;
            case 2:
                b.cCleaner();
                ListTasks.listarItensPasta();

            case 3:
                b.cCleaner();


            case 4:
                b.cCleaner();


            default:
                b.cCleaner();

                System.out.println("Opção inválida.");
                Menu.mainMenu();
        }
    }
}

