package org.example;


import org.example.model.entities.functions.Menu;
import org.example.model.entities.functions.dbUsers.AccountData;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("pt", "BR");
        Locale.setDefault(locale);
        Scanner sc = new Scanner(System.in);

        //System.out.print("Digite seu nome: ");
        //String user = sc.next();
        String user = "Gabriel Massera Nascimento";
        System.out.println("==  Bem Vindo as suas Tarefas  == \n" + "==  "+user.toUpperCase()+"  ==\n");
        System.out.println("_____________________________________");
        ///INSTANCES
        AccountData a = new AccountData(user);
        Menu menu = new Menu();


        Menu.mainMenu();
    }
}
