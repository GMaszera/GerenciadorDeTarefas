package org.example.model.entities.functions;

import org.example.model.Menu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class CreateATask {

    public String nameOfTask;
    private static String texto = ""; // Variável para armazenar o texto
    LocalDate dataAtual = LocalDate.now();

    public static void setText(String novoTexto) {
        texto = novoTexto;
    }

    public CreateATask(String nameOfTask) {
        super();
        this.nameOfTask = nameOfTask;
    }

    public String getNameOfTask() {
        return nameOfTask;
    }

    public void setNameOfTask(String nameOfTask) {
        this.nameOfTask = nameOfTask;
    }

    public static String getText() {
        return texto;
    }

    public void openTask() {
        // Caminho para criar a tarefa
        String caminhoArquivo = "C:\\Users\\Gabriel Massera\\Desktop\\Nova pasta\\" + nameOfTask + ".txt";

        try {
            File arquivo = new File(caminhoArquivo);
            FileWriter escritor = new FileWriter(arquivo);

            // Implementar um bloco de ultima atualização antes do texto
            escritor.write("Last Update: " + dataAtual + "\n\n");

            escritor.write(texto);

            escritor.close();

            System.out.println("Arquivo criado com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        Menu.mainMenu();
    }
}

