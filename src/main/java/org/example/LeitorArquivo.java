package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.example.Main.caminho;

public class LeitorArquivo {
    public static String verificarExiste() throws IOException {
        File arquivo = new File(caminho);
        String conteudo = "null";
        if (arquivo.exists()) {
            Path path = Paths.get(arquivo.getPath());
            conteudo = Files.readString(path);
            return conteudo;
        }
        else {
            return null;
        }
    }
}
