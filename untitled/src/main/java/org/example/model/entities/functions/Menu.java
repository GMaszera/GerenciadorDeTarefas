package org.example.model.entities.functions;

import org.example.model.entities.ConsoleCleaner;
import org.example.model.entities.functions.newTask.CreateATask;
import org.example.model.entities.functions.listEdit.ListTasks;

import java.util.Scanner;

public class Menu {

    public static void mainMenu() {
        ConsoleCleaner b = new ConsoleCleaner();
        Scanner sc = new Scanner(System.in);

        //Menu Genérico
        System.out.println("Tasks Manager");
        System.out.println("1 - Create new task");
        System.out.println("2 - List and Edit");
        System.out.println("3 - Make task done");
        System.out.println("4 - Exclude a task");

        System.out.print("Select one function: ");
        int function = sc.nextInt();

        switch (function) {
            case 1://Create a new file in the path
                b.cCleaner();
                System.out.print("What's title?: ");
                String title = sc.next();
                System.out.print("Text: ");
                String text = sc.next();
                CreateATask createATask = new CreateATask(title);
                createATask.setTexto(text);
                createATask.openTask();

            case 2://List all files in the path
                b.cCleaner();
                ListTasks.listarItensPasta();

            case 3://Make a task done, and move to another path
                b.cCleaner();


            case 4://Exclude a task in the path
                b.cCleaner();


            default://Make the user restart the menu
                b.cCleaner();

                System.out.println("ERROR: Option not identitfy !");
                Menu.mainMenu();
        }
    }
}

