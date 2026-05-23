package org.example;

import com.google.gson.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Inicializador {
    public static String iniciador (String conteudo){
        int leite = Console.lerint("informe a quantidade de leite:");
        int data = Console.lerint("informe a data:");
        boolean fora = Console.lerboolean("Há fora? (true/false):");
        Scanner sc = new Scanner(System.in);
        int hoje = LocalDate.now().getDayOfMonth();
        LocalDate date;

        if (data != hoje) {
            Console.aviso("A data informada não é hoje!");
            String texto = Console.lertexto("Informe novamente a data no formato AAAA-MM-DD");
            date = LocalDate.parse(texto);
        } else {
            date = LocalDate.now();
        }

        Gerenciador novo = new Gerenciador(leite, date, fora);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        if (conteudo == null) {
            JsonArray array = new JsonArray();

            String textoJsonFinal = gson.toJson(novo);

            JsonObject object = JsonParser.parseString(textoJsonFinal).getAsJsonObject();

            array.add(object);
            return array.toString();
        } else {
            JsonArray array = JsonParser.parseString(conteudo).getAsJsonArray();

            String textoJsonFinal = gson.toJson(novo);

            JsonObject object = JsonParser.parseString(textoJsonFinal).getAsJsonObject();
            array.add(object);
            return gson.toJson(array);
        }

    }
}
