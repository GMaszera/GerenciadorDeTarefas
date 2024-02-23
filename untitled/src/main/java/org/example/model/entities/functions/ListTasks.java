package org.example.model.entities.functions;

import org.example.model.Menu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListTasks {
    public static void listarItensPasta() {
        // Chama o método main da classe List dentro do método listarItensPasta
        List.main(new String[0]);
    }

    // Classe interna para listar os itens da pasta
    private static class List {
        Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            // Caminho da pasta a ser listada
            String diretorio = "C:\\Users\\Gabriel Massera\\Desktop\\Nova pasta\\";

            // Criar um objeto Path representando a pasta
            Path pasta = Paths.get(diretorio);


            // Itera sobre os arquivos na pasta e adiciona os nomes à lista
            try {
                ArrayList<String> nomesArquivos = new ArrayList<>();

                Files.list(pasta).forEach(item -> nomesArquivos.add(item.getFileName().toString()));
                System.out.println("=====================================");

                for (int i = 0; nomesArquivos.size() > i; i++) {
                    System.out.println(nomesArquivos.get(i));
                    ChangeStatus aa = new ChangeStatus("aaaa" + i);
                }


                System.out.println("=====================================");
                System.out.println("");
                Menu.mainMenu();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
