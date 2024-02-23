package org.example.model.entities.functions;

import org.example.model.Menu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListTasks {
    public static void listarItensPasta() {
        // Chama o método main da classe List dentro do método listarItensPasta
        List.main(new String[0]);
    }

    // Classe interna para listar os itens da pasta
    private static class List {
        public static void main(String[] args) {
            // Caminho da pasta a ser listada
            String diretorio = "C:\\Users\\Gabriel Massera\\Desktop\\Nova pasta\\";

            // Criar um objeto Path representando a pasta
            Path pasta = Paths.get(diretorio);

            try {
                // Listar todos os itens da pasta
                Files.list(pasta).forEach(item -> System.out.println(item.getFileName()));
            } catch (IOException e) {
                System.out.println("Ocorreu um erro ao listar os itens da pasta: " + e.getMessage());
                e.printStackTrace();
            }
            System.out.println("=================================");
            // Após listar os itens da pasta, chama o método mainMenu() da classe Menu
            Menu.mainMenu();
        }
    }
}
