package org.example;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        verificador();


    }

    private static String iniciador (){
        System.out.println("informe os dados: quantidade de leite, a data e se tirou(true ou false).");
        Scanner sc = new Scanner(System.in);
        int leite = sc.nextInt();
        int data = sc.nextInt();
        boolean fora = sc.nextBoolean();

        int hoje = LocalDate.now().getDayOfMonth();
        System.out.println("Hoje: " + hoje);
        LocalDate date;

        if (data != hoje) {
            System.out.printf("%s%n%s", "A data informada não é hoje!", "digite a Data informada (ano-mês-dia).");
            Scanner leitor = new Scanner(System.in);
            String texto = leitor.nextLine();
            date = LocalDate.parse(texto);
            System.out.println("data informada " + texto);
        } else {
            LocalDate realHoje = LocalDate.now();
            date = realHoje;
        }

        gerenciador novo = new gerenciador(leite, date, fora);

        Gson gson = new Gson();

        String textoJsonFinal = gson.toJson(novo);

        LocalDate teste = LocalDate.now();

        System.out.printf("%s%n%s", textoJsonFinal, teste);

        return textoJsonFinal;
    }

    private static void verificador() {
        File arquivo = new File("arquivo.json");

        if (arquivo.exists()) {
            System.out.println("Arquivo foi encontrado.");
            iniciador();
        }
        else {
            System.out.println("Arquivo nao encontrado. Criando arquivo.");
            String passar = iniciador();
            criar(passar);
        }
    }

    private static void criar (String conteudo){
        try {
            Path arquivoPath = Path.of("arquivo.json");
            Files.writeString(arquivoPath, conteudo);

        }
        catch (Exception e) {
            System.out.println("Erro ao criar arquivo.");
        }
    }
}
