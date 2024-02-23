package org.example.model;

import org.example.model.entities.ConsoleCleaner;
import org.example.model.entities.functions.ChangeStatus;
import org.example.model.entities.functions.CreateATask;
import org.example.model.entities.functions.ListTasks;

import java.util.Scanner;

public class Menu {

    public static void mainMenu() {
        ConsoleCleaner b = new ConsoleCleaner();
        Scanner sc = new Scanner(System.in);

        //Menu Genérico
        System.out.println("GERENCIADOR DE TAREFAS");
        System.out.println("A - CRIAR NOVA TAREFA");
        System.out.println("B - LISTAR TAREFAS");
        System.out.println("C - MARCAR TAREFA COMO CONCLUIDA");
        System.out.println("D - EXCLUIR TAREFA");

        System.out.print("Selecione a função: ");
        char function = sc.next().charAt(0);

        if (function == 'A' || function == 'a') {
            b.cCleaner();
            System.out.print("Qual o titulo da sua criação: ");
            String title = sc.next();
            System.out.print("Text: ");
            String text = sc.next();
            CreateATask createATask = new CreateATask(title);
            createATask.setText(text);
            createATask.openTask();
        }
        if (function == 'B' || function == 'b') {
            b.cCleaner();
            ListTasks.listarItensPasta();

        }
        if (function == 'C' || function == 'c') {
            b.cCleaner();
            ChangeStatus.statusState();
            //ChangeStatus.
            //flagTaskMenu();
        }
        if (function == 'D' || function == 'd') {
            b.cCleaner();
            //excludeTaskMenu();
        }

    }
}
