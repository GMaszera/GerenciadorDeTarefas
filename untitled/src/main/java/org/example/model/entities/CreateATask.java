package org.example.model.entities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateATask {

    private static String texto = ""; // Variável para armazenar o texto

    public static void setText(String novoTexto) {
        texto = novoTexto;
    }
    // Método para obter o texto do quadro negro
    public static String getText() {
        return texto;
    }

    public void createATask() {
        // Caminho para criar a tarefa
        String caminhoArquivo = "C:\\Users\\Gabriel Massera\\Desktop\\Nova pasta\\mytasks.txt";

        try {
            File arquivo = new File(caminhoArquivo);
            FileWriter escritor = new FileWriter(arquivo);

            // Implementar um bloco de ultima atualização antes do texto
            escritor.write("Last Update: NULL/NUL/NULL\n\n");

            escritor.write(texto);


            escritor.close();

            System.out.println("Arquivo criado com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

