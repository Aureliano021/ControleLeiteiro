package org.example;

import java.io.DataInput;
import java.io.IOException;
import java.nio.file.Path;
import java.time.format.DateTimeFormatter;

import static org.example.UI.iniciar;

public class Main {
    public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static final String caminho = "arquivoan.json";
    public static void main(String[] args) throws IOException {
        iniciar();
    }
}
