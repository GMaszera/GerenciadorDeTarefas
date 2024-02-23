package org.example;


import org.example.model.entities.AccountData;
import org.example.model.entities.ConsoleCleaner;
import org.example.model.entities.CreateATask;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("pt", "BR");
        Locale.setDefault(locale);

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String user = sc.next();

        //Instanciamento
        AccountData a = new AccountData(user);
        ConsoleCleaner b = new ConsoleCleaner();
        CreateATask createATask = new CreateATask();

        //Menu Genérico
        System.out.println("GERENCIADOR DE TAREFAS");
        System.out.println("A - CRIAR NOVA TAREFA");
        System.out.println("B - LISTAR TAREFAS DE" + user);
        System.out.println("C - MARCAR TAREFA COMO CONCLUIDA");
        System.out.println("D - EXCLUIR TAREFA");

        System.out.print("Selecione a função: ");
        char function = sc.next().charAt(0);

        if (function == 'A' || function == 'a') {
            b.cCleaner();
            String text = sc.next();
            createATask.setText(text);
            createATask.createATask();
        }
        if (function == 'B' || function == 'b') {
            b.cCleaner();
            //listTasksFromUser
        }
        if (function == 'C' || function == 'c') {
            b.cCleaner();
            //flagTaskMenu();
        }
        if (function == 'D' || function == 'd') {
            b.cCleaner();
            //excludeTaskMenu();
        }

    }
}
